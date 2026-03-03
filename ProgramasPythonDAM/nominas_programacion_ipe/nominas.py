# nominas de IPE
class Nomina:
    def __init__(self, datos_empleado, devengos):
        # 1. Parámetros de Control (Lo que define al trabajador)
        self.grupo = datos_empleado.get("grupo")  # 1 - 7
        self.tipo_contrato = datos_empleado.get("tipo")  # Indefinido/Temporal
        self.irpf = datos_empleado.get("irpf") / 100  # Porcentaje
        self.at_ep = datos_empleado.get("at_ep") / 100  # Porcentajes

        # 2. Parámetros Económicos (Los números del mes)
        self.conceptos = devengos  # Diccionario con SB, pluses, etc.

        # 3. Variables de Salida (Para guardar los resultados)
        self.totales = {
            "devengado": 0.0,
            "base_cc": 0.0,
            "base_cp": 0.0,
            "deducciones": 0.0,
            "liquido": 0.0,
        }

    def calcular_total_devengado(self):
        # 1. Sumamos conceptos salariales ->
        self.salariales = (
            self.conceptos.get("salario_base", 0)
            + self.conceptos.get("antiguedad", 0)
            + self.conceptos.get("plus_actividad", 0)
            + self.conceptos.get("plus_peligrosidad", 0)
            + self.conceptos.get("plus_nocturnidad", 0)
            + self.conceptos.get("incentivos", 0)
            + self.conceptos.get("horas_extra_comunes", 0)
            + self.conceptos.get("horas_extra_fin", 0)
        )

        # 2. Sumamos percepciones no salariales ->
        #    sumamos el TOTAL percibido, aunque luego no cotice una parte ->
        self.no_salariales = (
            self.conceptos.get("plus_transporte", 0)
            + self.conceptos.get("importe_locomocion", 0)
            + self.conceptos.get("importe_dietas", 0)
        )

        # 3. guardamos el total en nuestro diccionario de resultados ->
        self.totales["devengado"] = self.salariales + self.no_salariales
        return self.totales

    def calcular_bcc(self):
        # A. Remuneración mensual (sin horas extra)
        remuneracion_mensual = (
            self.conceptos.get("salario_base", 0)
            + self.conceptos.get("antiguedad", 0)
            + self.conceptos.get(
                "pluses_salariales", 0
            )  # Suma de plus actividad, peligrosidad, etc.
        )

        # B. Excesos de dietas/locomoción (lo que SÍ cotiza)
        exceso_locomocion = max(
            0,
            self.conceptos.get("importe_locomocion", 0)
            - (self.conceptos.get("km", 0) * 0.26),
        )
        # Para simplificar tus ejercicios, si no hay factura de hotel o supera límites, cotiza el exceso
        exceso_dietas = self.conceptos.get("exceso_dietas", 0)

        # C. Cálculo de la Prorrata
        n_pagas = self.conceptos.get("num_pagas_extra", 2)
        importe_paga = self.conceptos.get("importe_paga_extra", 0)
        prorrata = (n_pagas * importe_paga) / 12

        # D. Suma final BCC
        total_bcc = remuneracion_mensual + exceso_locomocion + exceso_dietas + prorrata

        # E. Control de topes (IMPORTANTE para 2026)
        # Debes comparar total_bcc con las bases mínimas y máximas de 2026
        self.totales["base_cc"] = self.ajustar_a_topes(total_bcc)

        return self.totales["base_cc"]


# ejercicio 1 ->

# Según el enunciado de Teresita [cite: 9, 14]
perfil = {"grupo": 3, "tipo": "indefinido", "irpf": 20, "at_ep": 3}

# Conceptos de su última nómina [cite: 10, 12]
dinero = {
    "salario_base": 1200,
    "antiguedad": 100,
    "plus_actividad": 150,
    "he_fuerza_mayor": 50,
    "km": 1000,
    "importe_locomocion": 320,
    "pagas_extras": 2,
    "cuantia_paga": 1300,  # Salario Base + Antigüedad
}

nomina_act1 = Nomina(perfil, dinero)
