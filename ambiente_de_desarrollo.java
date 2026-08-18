import java.util.Scanner;
public class ambiente_de_desarrollo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] proyectos = new String[10];
        String[] lenguajes = new String[10];
        String[] ides = new String[10];
        String[] versiones = new String[10];
        String[] sistemasOperativos = new String[10];
        String[] herramientas = new String[10];
        String[] fechasConfiguracion = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-------------------------------------------//
        //--|menu_principal_ambiente_de_desarrollo|--//
        //-------------------------------------------//
        do {
            System.out.println("menu principal ambiente de desarrollo");
            System.out.println("1) Registrar ambiente");
            System.out.println("2) Editar ambiente");
            System.out.println("3) Listar ambientes");
            System.out.println("4) Buscar ambiente");
            System.out.println("5) Eliminar ambiente");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //------------------------//
                //--|registrar_ambiente|--//
                //------------------------//
                case 1:
                    if (total >= proyectos.length) {
                        System.out.println("No hay espacio para registrar mas ambientes.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de ambiente de desarrollo");
                    System.out.println("id del ambiente a registrar: " + id);
                    System.out.print("nombre del proyecto: ");
                    proyectos[total] = entrada.nextLine();
                    System.out.print("lenguaje de programacion: ");
                    lenguajes[total] = entrada.nextLine();
                    System.out.print("entorno o IDE: ");
                    ides[total] = entrada.nextLine();
                    System.out.print("version del lenguaje: ");
                    versiones[total] = entrada.nextLine();
                    System.out.print("sistema operativo: ");
                    sistemasOperativos[total] = entrada.nextLine();
                    System.out.print("herramientas utilizadas: ");
                    herramientas[total] = entrada.nextLine();
                    System.out.print("fecha de configuracion: ");
                    fechasConfiguracion[total] = entrada.nextLine();
                    System.out.print("estado del ambiente: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Ambiente de desarrollo registrado correctamente.");
                    total++;
                    break;
                //---------------------//
                //--|editar_ambiente|--//
                //---------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen ambientes registrados.");
                        break;
                    }
                    System.out.println("Datos de los ambientes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Proyecto: " + proyectos[i] + " | Lenguaje: " + lenguajes[i] + " | IDE: " + ides[i] + " | Version: " + versiones[i] + " | Sistema operativo: " + sistemasOperativos[i] + " | Herramientas: " + herramientas[i] + " | Fecha configuracion: " + fechasConfiguracion[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del ambiente: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del ambiente");
                        System.out.print("Nuevo nombre del proyecto: ");
                        proyectos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo lenguaje de programacion: ");
                        lenguajes[posicion] = entrada.nextLine();
                        System.out.print("Nuevo entorno o IDE: ");
                        ides[posicion] = entrada.nextLine();
                        System.out.print("Nueva version del lenguaje: ");
                        versiones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo sistema operativo: ");
                        sistemasOperativos[posicion] = entrada.nextLine();
                        System.out.print("Nuevas herramientas utilizadas: ");
                        herramientas[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de configuracion: ");
                        fechasConfiguracion[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del ambiente: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Ambiente actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|listar_ambientes|--//
                //----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen ambientes registrados.");
                    } else {
                        System.out.println("Lista de ambientes de desarrollo");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Proyecto: " + proyectos[i] + " | Lenguaje: " + lenguajes[i] + " | IDE: " + ides[i] + " | Version: " + versiones[i] + " | Sistema operativo: " + sistemasOperativos[i] + " | Herramientas: " + herramientas[i] + " | Fecha configuracion: " + fechasConfiguracion[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //---------------------//
                //--|buscar_ambiente|--//
                //---------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen ambientes registrados.");
                        break;
                    }
                    System.out.println("busqueda de ambiente");
                    System.out.print("ingresa la id para buscar ambiente: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del ambiente encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Proyecto: " + proyectos[posicion] + " | Lenguaje: " + lenguajes[posicion] + " | IDE: " + ides[posicion] + " | Version: " + versiones[posicion] + " | Sistema operativo: " + sistemasOperativos[posicion] + " | Herramientas: " + herramientas[posicion] + " | Fecha configuracion: " + fechasConfiguracion[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|eliminar_ambiente|--//
                //-----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen ambientes registrados.");
                        break;
                    }
                    System.out.println("Datos de los ambientes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Proyecto: " + proyectos[i] + " | Lenguaje: " + lenguajes[i] + " | IDE: " + ides[i] + " | Version: " + versiones[i] + " | Sistema operativo: " + sistemasOperativos[i] + " | Herramientas: " + herramientas[i] + " | Fecha configuracion: " + fechasConfiguracion[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del ambiente a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            proyectos[i] = proyectos[i + 1];
                            lenguajes[i] = lenguajes[i + 1];
                            ides[i] = ides[i + 1];
                            versiones[i] = versiones[i + 1];
                            sistemasOperativos[i] = sistemasOperativos[i + 1];
                            herramientas[i] = herramientas[i + 1];
                            fechasConfiguracion[i] = fechasConfiguracion[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Ambiente eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen ambientes registrados.");
                        break;
                    }
                    int activos = 0;
                    int configuracion = 0;
                    int finalizados = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Activo")) {
                            activos++;
                        } else if (estados[i].equalsIgnoreCase("En configuracion")) {
                            configuracion++;
                        } else if (estados[i].equalsIgnoreCase("Finalizado")) {
                            finalizados++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String lenguajeMayor = lenguajes[0];
                    int cantidadLenguajeMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadLenguaje = 0;
                        for (int j = 0; j < total; j++) {
                            if (lenguajes[i].equalsIgnoreCase(lenguajes[j])) {
                                cantidadLenguaje++;
                            }
                        }
                        if (cantidadLenguaje > cantidadLenguajeMayor) {
                            cantidadLenguajeMayor = cantidadLenguaje;
                            lenguajeMayor = lenguajes[i];
                        }
                    }
                    String ideMayor = ides[0];
                    int cantidadIdeMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadIde = 0;
                        for (int j = 0; j < total; j++) {
                            if (ides[i].equalsIgnoreCase(ides[j])) {
                                cantidadIde++;
                            }
                        }
                        if (cantidadIde > cantidadIdeMayor) {
                            cantidadIdeMayor = cantidadIde;
                            ideMayor = ides[i];
                        }
                    }
                    String sistemaMayor = sistemasOperativos[0];
                    int cantidadSistemaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadSistema = 0;
                        for (int j = 0; j < total; j++) {
                            if (sistemasOperativos[i].equalsIgnoreCase(sistemasOperativos[j])) {
                                cantidadSistema++;
                            }
                        }
                        if (cantidadSistema > cantidadSistemaMayor) {
                            cantidadSistemaMayor = cantidadSistema;
                            sistemaMayor = sistemasOperativos[i];
                        }
                    }
                    System.out.println("resumen de ambientes de desarrollo");
                    System.out.println("Ambientes registrados: " + total);
                    System.out.println("Lenguaje mas utilizado: " + lenguajeMayor);
                    System.out.println("IDE mas utilizado: " + ideMayor);
                    System.out.println("Sistema operativo mas utilizado: " + sistemaMayor);
                    System.out.println("Activos: " + activos);
                    System.out.println("En configuracion: " + configuracion);
                    System.out.println("Finalizados: " + finalizados);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Ambiente de Desarrollo.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}