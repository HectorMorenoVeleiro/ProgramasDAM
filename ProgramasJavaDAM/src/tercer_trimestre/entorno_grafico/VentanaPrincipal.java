package tercer_trimestre.entorno_grafico;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class VentanaPrincipal extends JFrame implements
        ActionListener {

    // ---- este es nuestro modelo de datos ----------------------
    private ListaPersonas lista;

    // ---- esta es nuestra vista --------------------------------
    private Container contenedor;

    // ---- etiquetas static atrib -------------------------------
    private JLabel nombre, apellidos, teléfono, dirección;

    // ---- campos enter text ------------------------------------
    private JTextField campoNombre, campoApellidos, campoTeléfono,
            campoDirección;

    // ---- botones ----------------------------------------------
    private JButton añadir, eliminar, borrarLista, guardar, cargar;

    // ---- lista personas ---------------------------------------
    private JList<String> listaNombres;

    // ---- obj modelo vista -------------------------------------
    private DefaultListModel<String> modelo;

    // ---- barra desplazamiento ---------------------------------
    private JScrollPane scrollLista;

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        // --- INICIALIZACIÓN DE DATOS ---
        // Instancia el objeto que gestionará la colección o base de datos de las
        // personas
        lista = new ListaPersonas();

        // --- INICIALIZACIÓN DE LA INTERFAZ ---
        // Llama al método encargado de construir y organizar los componentes en la
        // ventana
        inicio();

        // --- CONFIGURACIÓN DE LA VENTANA (JFRAME) ---
        // Establece el título que se mostrará en la barra superior de la ventana
        setTitle("Personas");

        // Define las dimensiones de la ventana: 270 píxeles de ancho por 350 píxeles de
        // alto
        setSize(270, 350);

        // Centra la ventana automáticamente en el medio de la pantalla del usuario
        setLocationRelativeTo(null);

        // Configura el comportamiento de cierre: finaliza la ejecución del programa por
        // completo al pulsar la 'X'
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Bloquea la opción de maximizar o estirar la ventana para que el diseño
        // absoluto (null layout) no se descoloque
        setResizable(false);
    }

    /**
     * Método que crea la ventana con sus diferentes componentes
     * gráficos
     */
    private void inicio() {
        // --- ASIGNACIÓN DEL CONTENEDOR PRINCIPAL ---
        // Obtiene el panel de contenido de la ventana (JFrame) para poder añadir
        // componentes
        contenedor = getContentPane();

        // --- CONFIGURACIÓN DEL DISEÑO (LAYOUT) ---
        // Desactiva el administrador de diseño (Layout Manager).
        // Esto permite posicionar los componentes de forma absoluta usando coordenadas
        // exactas (setBounds).
        contenedor.setLayout(null);

        // --- CONFIGURACIÓN DE LA ETIQUETA 'NOMBRE' ---
        // Inicializa el objeto 'nombre' como una nueva etiqueta de texto (JLabel)
        nombre = new JLabel();
        // Define el texto visible de la etiqueta como "Nombre:"
        nombre.setText("Nombre:");

        // establece posicion de etiqueta
        // --- CONFIGURACIÓN DE 'NOMBRE' ---
        nombre.setBounds(20, 20, 135, 23); // Posición y tamaño de la etiqueta 'nombre'
        campoNombre = new JTextField(); // Creación del campo de texto para el nombre
        campoNombre.setBounds(105, 20, 135, 23); // Posición y tamaño del campo de texto

        // --- CONFIGURACIÓN DE 'APELLIDOS' ---
        apellidos = new JLabel(); // Creación de la etiqueta para los apellidos
        apellidos.setText("Apellidos:"); // Asignación del texto a la etiqueta
        apellidos.setBounds(20, 50, 135, 23); // Posición y tamaño de la etiqueta
        campoApellidos = new JTextField(); // Creación del campo de texto para los apellidos
        campoApellidos.setBounds(105, 50, 135, 23); // Posición y tamaño del campo de texto

        // --- CONFIGURACIÓN DE 'TELÉFONO' ---
        teléfono = new JLabel(); // Creación de la etiqueta para el teléfono
        teléfono.setText("Teléfono:"); // Asignación del texto a la etiqueta
        teléfono.setBounds(20, 80, 135, 23); // Posición y tamaño de la etiqueta
        campoTeléfono = new JTextField(); // Creación del campo de texto para el teléfono
        campoTeléfono.setBounds(105, 80, 135, 23); // Posición y tamaño del campo de texto

        // --- CONFIGURACIÓN DE 'DIRECCIÓN' ---
        dirección = new JLabel(); // Creación de la etiqueta para la dirección
        dirección.setText("Dirección:"); // Asignación del texto a la etiqueta
        dirección.setBounds(20, 110, 135, 23); // Posición y tamaño de la etiqueta
        campoDirección = new JTextField(); // Creación del campo de texto para la dirección
        campoDirección.setBounds(105, 110, 135, 23); // Posición y tamaño del campo de texto

        // --- CONFIGURACIÓN DEL BOTÓN 'AÑADIR' ---
        añadir = new JButton(); // Creación del botón Añadir
        añadir.setText("Añadir"); // Asignación del texto al botón
        añadir.setBounds(105, 150, 80, 23); // Posición y tamaño del botón
        añadir.addActionListener(this); // Evento para capturar el clic en este botón

        // --- CONFIGURACION DEL BOTON 'CARGARLISTA'
        cargar = new JButton();
        cargar.setText("CARGAR LISTA");
        cargar.setBounds(29, 339, 199, 23);

        // --- CONFIGURACION DEL BOTON 'GUARDARLISTA'
        guardar = new JButton();
        guardar.setText("GUARDAR LISTA");
        guardar.setBounds(29, 330, 199, 23);

        // --- CONFIGURACIÓN DEL BOTÓN 'ELIMINAR' ---
        eliminar = new JButton(); // Creación del botón Eliminar
        eliminar.setText("Eliminar"); // Asignación del texto al botón
        eliminar.setBounds(20, 280, 80, 23); // Posición y tamaño del botón
        eliminar.addActionListener(this); // Evento para capturar el clic en este botón

        // --- CONFIGURACIÓN DEL BOTÓN 'BORRAR LISTA' ---
        borrarLista = new JButton(); // Creación del botón Borrar Lista
        borrarLista.setText("Borrar Lista"); // Asignación del texto al botón
        borrarLista.setBounds(120, 280, 120, 23); // Posición y tamaño del botón
        borrarLista.addActionListener(this); // Evento para capturar el clic en este botón

        // --- CONFIGURACIÓN DE LA LISTA Y EL PANEL DE DESPLAZAMIENTO ---
        listaNombres = new JList<>(); // Creación de la lista gráfica
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Permite seleccionar solo un elemento a la
                                                                            // vez
        modelo = new DefaultListModel<>(); // Creación del modelo que guardará los datos de la lista
        scrollLista = new JScrollPane(); // Creación del panel con barras de desplazamiento
        scrollLista.setBounds(20, 190, 220, 80); // Posición y tamaño del panel de desplazamiento
        scrollLista.setViewportView(listaNombres); // Asocia la lista dentro del panel de desplazamiento

        // --- AGREGAR COMPONENTES AL CONTENEDOR PRINCIPAL ---
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(teléfono);
        contenedor.add(campoTeléfono);
        contenedor.add(dirección);
        contenedor.add(campoDirección);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista); // Se añade el JScrollPane (que ya contiene la lista)
        contenedor.add(guardar);
        contenedor.add(cargar);
    }

    /**
     * Método que gestiona los eventos de acción (clics en los botones)
     * generados en la ventana principal.
     */
    @Override
    public void actionPerformed(ActionEvent evento) {

        // --- EVENTO: BOTÓN AÑADIR ---
        // Comprueba si el objeto que originó el evento es el botón 'añadir'
        if (evento.getSource() == añadir) {
            añadirPersona(); // Llama al método para registrar una nueva persona
        }

        // --- EVENTO: BOTÓN ELIMINAR ---
        // Comprueba si el objeto que originó el evento es el botón 'eliminar'
        if (evento.getSource() == eliminar) {
            // Obtiene el índice de la fila seleccionada en la JList y lo pasa al método de
            // eliminación
            eliminarNombre(listaNombres.getSelectedIndex());
        }

        // --- EVENTO: BOTÓN BORRAR LISTA ---
        // Comprueba si el objeto que originó el evento es el botón 'borrarLista'
        if (evento.getSource() == borrarLista) {
            borrarLista(); // Llama al método para vaciar por completo la lista de la interfaz
        }
    }

    /**
     * Método que agrega una persona tanto al modelo de datos (vector)
     * como a la lista gráfica (JList) de la interfaz.
     */
    private void añadirPersona() {
        // --- 1. CREACIÓN DEL OBJETO PERSONA ---
        // Recupera los textos de los campos del formulario y crea la instancia
        Persona p = new Persona(
                campoNombre.getText(),
                campoApellidos.getText(),
                campoTeléfono.getText(),
                campoDirección.getText());

        // Guarda el objeto Persona en la lógica de negocio (vector/lista interna)
        lista.añadirPersona(p);

        // --- 2. ACTUALIZACIÓN DE LA INTERFAZ GRÁFICA ---
        // Modela la cadena de texto con los datos concatenados por guiones para mostrar
        // en la lista
        String elemento = campoNombre.getText() + "-" +
                campoApellidos.getText() + "-" +
                campoTeléfono.getText() + "-" +
                campoDirección.getText();

        // Agrega la cadena de texto al modelo visual
        modelo.addElement(elemento);

        // Refresca la JList aplicando el modelo actualizado
        listaNombres.setModel(modelo);

        // --- 3. LIMPIEZA DEL FORMULARIO ---
        // Vacía todos los campos de entrada para permitir un nuevo registro
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTeléfono.setText("");
        campoDirección.setText("");
    }

    /**
     * Método que elimina una persona del vector y de la lista gráfica.
     * 
     * @param indice Posición del elemento seleccionado en la JList.
     */
    private void eliminarNombre(int indice) {
        // Controla si hay un elemento seleccionado válido (JList devuelve -1 si no hay
        // selección)
        if (indice >= 0) {
            // Elimina la fila visual correspondiente en el JList
            modelo.removeElementAt(indice);

            // Elimina el objeto equivalente en la lista interna/lógica de datos
            lista.eliminarPersona(indice);
        } else {
            // Si el índice es -1, muestra una ventana emergente advirtiendo al usuario
            JOptionPane.showMessageDialog(
                    null,
                    "Debe seleccionar un elemento",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método que vacía por completo todos los registros del programa.
     */
    private void borrarLista() {
        // Borra todos los objetos del almacenamiento interno (vector)
        lista.borrarLista();

        // Limpia el modelo visual de la JList eliminando todas las filas de la pantalla
        modelo.clear();
    }
}