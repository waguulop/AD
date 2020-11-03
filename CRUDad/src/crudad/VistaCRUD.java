package crudad;

import javax.swing.JTextField;

/**
 *
 * @author guillermosq
 */
public class VistaCRUD extends javax.swing.JFrame {

    public int seleccion = 0;
    public String seleccion_combobox = "";
    public VistaCRUD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelUsuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        botonModificar = new javax.swing.JButton();
        botonAniadir = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        cajaLogin = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaApellidos = new javax.swing.JTextField();
        cajaEmail = new javax.swing.JTextField();
        cajaTipo = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        PanelPeticion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPeticion = new javax.swing.JTable();
        botonAceptarTablaPeticion = new javax.swing.JButton();
        botonCancelarTablaPeticion = new javax.swing.JButton();
        botonModificarTablaPeticion = new javax.swing.JButton();
        botonAniadirTablaPeticion = new javax.swing.JButton();
        botonEliminarTablaPeticion = new javax.swing.JButton();
        labelID_peticion_tablapeticion = new javax.swing.JLabel();
        labelLoginTablaPeticion = new javax.swing.JLabel();
        labelEstadoTablaPeticion = new javax.swing.JLabel();
        labelCursoTablaPeticion = new javax.swing.JLabel();
        labelPythonTablaPeticion = new javax.swing.JLabel();
        cajaId_peticion_Tabla_peticion = new javax.swing.JTextField();
        cajaLogin_Tabla_peticion = new javax.swing.JTextField();
        cajaEstado_Tabla_peticion = new javax.swing.JTextField();
        cajaCurso_tabla_Peticion = new javax.swing.JTextField();
        cajaPropuesta_python = new javax.swing.JTextField();
        cBPeticion = new javax.swing.JComboBox<>();
        PanelMemoria = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMemoria = new javax.swing.JTable();
        botonModificarTablaMemoria = new javax.swing.JButton();
        botonAniadirTablaMemoria = new javax.swing.JButton();
        botonEliminarTablaMemoria = new javax.swing.JButton();
        botonAceptarTablaMemoria = new javax.swing.JButton();
        botonCancelarTablaMemoria = new javax.swing.JButton();
        cajaId_memoria = new javax.swing.JTextField();
        cajaId_peticion = new javax.swing.JTextField();
        cajaEspacio = new javax.swing.JTextField();
        cajaEstado = new javax.swing.JTextField();
        cajaDireccion_de_memoria = new javax.swing.JTextField();
        labelId_memoria = new javax.swing.JLabel();
        labelId_peticion = new javax.swing.JLabel();
        labelEspacio = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelDireccion_de_memoria = new javax.swing.JLabel();
        cbMemoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Login", "Nombre", "Apellidos", "Email", "Tipo"
            }
        ));
        tablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuario);

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonAniadir.setText("Añadir");

        botonEliminar.setText("Eliminar");

        labelLogin.setText("Login");

        labelNombre.setText("Nombre");

        labelApellidos.setText("Apellidos");

        labelEmail.setText("Email");

        labelTipo.setText("Tipo");

        cajaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEmailActionPerformed(evt);
            }
        });

        cajaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTipoActionPerformed(evt);
            }
        });

        botonAceptar.setText("Aceptar");

        botonCancelar.setText("Cancelar");

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelTipo)
                                .addGap(50, 50, 50))
                            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelApellidos)
                                    .addComponent(labelEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(cajaEmail)
                            .addComponent(cajaTipo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelUsuarioLayout.createSequentialGroup()
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLogin)
                            .addComponent(labelNombre))
                        .addGap(28, 28, 28)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaNombre)
                            .addComponent(cajaLogin)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelUsuarioLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(botonAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(botonCancelar)))
                .addGap(47, 47, 47))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botonAniadir)
                .addGap(41, 41, 41)
                .addComponent(botonModificar)
                .addGap(44, 44, 44)
                .addComponent(botonEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLogin)
                            .addComponent(cajaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelApellidos)
                            .addComponent(cajaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEmail)
                            .addComponent(cajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTipo)
                            .addComponent(cajaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAniadir))
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Usuario", PanelUsuario);

        tablaPeticion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_peticion", "Login", "Estado", "Curso", "Propuesta_python"
            }
        ));
        tablaPeticion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPeticionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPeticion);

        botonAceptarTablaPeticion.setText("Aceptar");

        botonCancelarTablaPeticion.setText("Cancelar");

        botonModificarTablaPeticion.setText("Modificar");

        botonAniadirTablaPeticion.setText("Añadir");

        botonEliminarTablaPeticion.setText("Eliminar");
        botonEliminarTablaPeticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarTablaPeticionActionPerformed(evt);
            }
        });

        labelID_peticion_tablapeticion.setText("Id_peticion");

        labelLoginTablaPeticion.setText("Login");

        labelEstadoTablaPeticion.setText("Estado");

        labelCursoTablaPeticion.setText("Curso");

        labelPythonTablaPeticion.setText("Propuesta python");

        cajaLogin_Tabla_peticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaLogin_Tabla_peticionActionPerformed(evt);
            }
        });

        cajaCurso_tabla_Peticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCurso_tabla_PeticionActionPerformed(evt);
            }
        });

        cBPeticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBPeticionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPeticionLayout = new javax.swing.GroupLayout(PanelPeticion);
        PanelPeticion.setLayout(PanelPeticionLayout);
        PanelPeticionLayout.setHorizontalGroup(
            PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPeticionLayout.createSequentialGroup()
                .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPeticionLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPeticionLayout.createSequentialGroup()
                                .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPeticionLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelLoginTablaPeticion)
                                            .addComponent(labelID_peticion_tablapeticion)
                                            .addComponent(labelEstadoTablaPeticion)
                                            .addComponent(labelCursoTablaPeticion)))
                                    .addGroup(PanelPeticionLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(labelPythonTablaPeticion)))
                                .addGap(18, 18, 18)
                                .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaCurso_tabla_Peticion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaPropuesta_python, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaEstado_Tabla_peticion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaLogin_Tabla_peticion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaId_peticion_Tabla_peticion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PanelPeticionLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(cBPeticion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(PanelPeticionLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(botonAniadirTablaPeticion)
                        .addGap(35, 35, 35)
                        .addComponent(botonModificarTablaPeticion)
                        .addGap(31, 31, 31)
                        .addComponent(botonEliminarTablaPeticion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAceptarTablaPeticion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelarTablaPeticion)))
                .addGap(57, 57, 57))
        );
        PanelPeticionLayout.setVerticalGroup(
            PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPeticionLayout.createSequentialGroup()
                .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPeticionLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(PanelPeticionLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelID_peticion_tablapeticion)
                            .addComponent(cajaId_peticion_Tabla_peticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaLogin_Tabla_peticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLoginTablaPeticion))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEstadoTablaPeticion)
                            .addComponent(cajaEstado_Tabla_peticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCursoTablaPeticion)
                            .addComponent(cajaCurso_tabla_Peticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPythonTablaPeticion)
                            .addComponent(cajaPropuesta_python, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cBPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPeticionLayout.createSequentialGroup()
                        .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonModificarTablaPeticion)
                            .addComponent(botonAniadirTablaPeticion)
                            .addComponent(botonEliminarTablaPeticion))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPeticionLayout.createSequentialGroup()
                        .addGroup(PanelPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAceptarTablaPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCancelarTablaPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );

        jTabbedPane1.addTab("Peticion", PanelPeticion);

        tablaMemoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_memoria", "Id_peticion", "Espacio", "Estado", "Direccion_de_memoria"
            }
        ));
        tablaMemoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMemoriaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaMemoria);

        botonModificarTablaMemoria.setText("Modificar");

        botonAniadirTablaMemoria.setText("Añadir");

        botonEliminarTablaMemoria.setText("Eliminar");

        botonAceptarTablaMemoria.setText("Aceptar");

        botonCancelarTablaMemoria.setText("Cancelar");

        cajaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEstadoActionPerformed(evt);
            }
        });

        labelId_memoria.setText("Id_memoria");

        labelId_peticion.setText("Id_peticion");

        labelEspacio.setText("Espacio");

        labelEstado.setText("Estado");

        labelDireccion_de_memoria.setText("Dir. Memoria");

        cbMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMemoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMemoriaLayout = new javax.swing.GroupLayout(PanelMemoria);
        PanelMemoria.setLayout(PanelMemoriaLayout);
        PanelMemoriaLayout.setHorizontalGroup(
            PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMemoriaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(botonAniadirTablaMemoria)
                .addGap(42, 42, 42)
                .addComponent(botonModificarTablaMemoria)
                .addGap(55, 55, 55)
                .addComponent(botonEliminarTablaMemoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptarTablaMemoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCancelarTablaMemoria)
                .addGap(55, 55, 55))
            .addGroup(PanelMemoriaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMemoriaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelId_memoria)
                            .addComponent(labelId_peticion)
                            .addComponent(labelEspacio))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaId_peticion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaId_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelMemoriaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEstado)
                            .addComponent(labelDireccion_de_memoria))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaDireccion_de_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelMemoriaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        PanelMemoriaLayout.setVerticalGroup(
            PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMemoriaLayout.createSequentialGroup()
                .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelMemoriaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelId_memoria)
                            .addComponent(cajaId_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaId_peticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelId_peticion))
                        .addGap(23, 23, 23)
                        .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEspacio)
                            .addComponent(cajaEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEstado)
                            .addComponent(cajaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDireccion_de_memoria)
                            .addComponent(cajaDireccion_de_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarTablaMemoria)
                    .addComponent(botonEliminarTablaMemoria)
                    .addComponent(botonAceptarTablaMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelarTablaMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAniadirTablaMemoria))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Memoria", PanelMemoria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarActionPerformed

    private void cajaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEmailActionPerformed

    private void cajaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTipoActionPerformed

    private void cajaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEstadoActionPerformed

    private void botonEliminarTablaPeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarTablaPeticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarTablaPeticionActionPerformed

    private void cajaLogin_Tabla_peticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaLogin_Tabla_peticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaLogin_Tabla_peticionActionPerformed

    private void cajaCurso_tabla_PeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCurso_tabla_PeticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCurso_tabla_PeticionActionPerformed

    
    private void tablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseClicked
        this.seleccion = this.tablaUsuario.getSelectedRow();
        this.cajaLogin.setText(this.tablaUsuario.getValueAt(seleccion, 0).toString());
        this.cajaNombre.setText(this.tablaUsuario.getValueAt(seleccion, 1).toString());
        this.cajaApellidos.setText(this.tablaUsuario.getValueAt(seleccion, 2).toString());
        this.cajaEmail.setText(this.tablaUsuario.getValueAt(seleccion, 3).toString());
        this.cajaTipo.setText(this.tablaUsuario.getValueAt(seleccion, 4).toString());
    }//GEN-LAST:event_tablaUsuarioMouseClicked

    private void tablaMemoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMemoriaMouseClicked
        this.seleccion = this.tablaMemoria.getSelectedRow();
        this.cajaId_memoria.setText(this.tablaMemoria.getValueAt(seleccion, 0).toString());
        this.cajaId_peticion.setText(this.tablaMemoria.getValueAt(seleccion, 1).toString());
        this.cajaEspacio.setText(this.tablaMemoria.getValueAt(seleccion, 2).toString());
        this.cajaEstado.setText(this.tablaMemoria.getValueAt(seleccion, 3).toString());
        this.cajaDireccion_de_memoria.setText(this.tablaMemoria.getValueAt(seleccion, 4).toString());
    }//GEN-LAST:event_tablaMemoriaMouseClicked

    private void tablaPeticionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPeticionMouseClicked
        this.seleccion = this.tablaPeticion.getSelectedRow();
        this.cajaId_peticion_Tabla_peticion.setText(this.tablaPeticion.getValueAt(seleccion, 0).toString());
        this.cajaLogin_Tabla_peticion.setText(this.tablaPeticion.getValueAt(seleccion, 1).toString());
        this.cajaEstado_Tabla_peticion.setText(this.tablaPeticion.getValueAt(seleccion, 2).toString());
        this.cajaCurso_tabla_Peticion.setText(this.tablaPeticion.getValueAt(seleccion, 3).toString());
        this.cajaPropuesta_python.setText(this.tablaPeticion.getValueAt(seleccion, 4).toString());
    }//GEN-LAST:event_tablaPeticionMouseClicked

    private void cBPeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBPeticionActionPerformed
        this.cajaLogin_Tabla_peticion.setText((String) this.cBPeticion.getSelectedItem());
    }//GEN-LAST:event_cBPeticionActionPerformed

    private void cbMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMemoriaActionPerformed
        this.cajaId_peticion.setText((String) this.cbMemoria.getSelectedItem());
    }//GEN-LAST:event_cbMemoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMemoria;
    private javax.swing.JPanel PanelPeticion;
    private javax.swing.JPanel PanelUsuario;
    public javax.swing.JButton botonAceptar;
    public javax.swing.JButton botonAceptarTablaMemoria;
    public javax.swing.JButton botonAceptarTablaPeticion;
    public javax.swing.JButton botonAniadir;
    public javax.swing.JButton botonAniadirTablaMemoria;
    public javax.swing.JButton botonAniadirTablaPeticion;
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonCancelarTablaMemoria;
    public javax.swing.JButton botonCancelarTablaPeticion;
    public javax.swing.JButton botonEliminar;
    public javax.swing.JButton botonEliminarTablaMemoria;
    public javax.swing.JButton botonEliminarTablaPeticion;
    public javax.swing.JButton botonModificar;
    public javax.swing.JButton botonModificarTablaMemoria;
    public javax.swing.JButton botonModificarTablaPeticion;
    public javax.swing.JComboBox<String> cBPeticion;
    public javax.swing.JTextField cajaApellidos;
    public javax.swing.JTextField cajaCurso_tabla_Peticion;
    public javax.swing.JTextField cajaDireccion_de_memoria;
    public javax.swing.JTextField cajaEmail;
    public javax.swing.JTextField cajaEspacio;
    public javax.swing.JTextField cajaEstado;
    public javax.swing.JTextField cajaEstado_Tabla_peticion;
    public javax.swing.JTextField cajaId_memoria;
    public javax.swing.JTextField cajaId_peticion;
    public javax.swing.JTextField cajaId_peticion_Tabla_peticion;
    public javax.swing.JTextField cajaLogin;
    public javax.swing.JTextField cajaLogin_Tabla_peticion;
    public javax.swing.JTextField cajaNombre;
    public javax.swing.JTextField cajaPropuesta_python;
    public javax.swing.JTextField cajaTipo;
    public javax.swing.JComboBox<String> cbMemoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel labelApellidos;
    public javax.swing.JLabel labelCursoTablaPeticion;
    public javax.swing.JLabel labelDireccion_de_memoria;
    public javax.swing.JLabel labelEmail;
    public javax.swing.JLabel labelEspacio;
    public javax.swing.JLabel labelEstado;
    public javax.swing.JLabel labelEstadoTablaPeticion;
    public javax.swing.JLabel labelID_peticion_tablapeticion;
    public javax.swing.JLabel labelId_memoria;
    public javax.swing.JLabel labelId_peticion;
    public javax.swing.JLabel labelLogin;
    public javax.swing.JLabel labelLoginTablaPeticion;
    public javax.swing.JLabel labelNombre;
    public javax.swing.JLabel labelPythonTablaPeticion;
    public javax.swing.JLabel labelTipo;
    public javax.swing.JTable tablaMemoria;
    public javax.swing.JTable tablaPeticion;
    public javax.swing.JTable tablaUsuario;
    // End of variables declaration//GEN-END:variables
}
