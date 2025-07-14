import java.util.Scanner;

public class GestorDeTareas {
    public static void main(String[] args){
        Scanner wrd = new Scanner(System.in);

        int totalPriority = 0;

        System.out.println("=== Gestor de Tareas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tareas Pendientes");
        System.out.println("3.  Salir");

        System.out.print("Seleccione una opción: ");
        int option = wrd.nextInt();
        wrd.nextLine();


        if (option >= 1 && option <= 3) {
            if (option == 1) {
                System.out.print("Please type a name fot the task: ");
                String nameTask = wrd.nextLine();

                System.out.print("Please assign a priority from 1 to 5: ");
                int priority = wrd.nextInt();


                boolean validate = priority >= 1 && priority <= 5;
                System.out.println("¿Priority values? " + validate);

                totalPriority += priority;

                System.out.println("Task added succesfully " + nameTask + " (priority = " + priority + ")");
                System.out.println("The priority off all the task is: " + totalPriority);
            } else if (option == 2) {
                System.out.println("Function not added to the system");
            } else {
                System.out.println("!!See you later¡¡");
            }
        }
        else{
            System.out.println("Invalid Option");
        }
        wrd.close();
    }
}
