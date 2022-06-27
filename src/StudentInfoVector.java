import java.util.Scanner;

public class StudentInfoVector {
    public static void main(String[] args) {
        AddData addstud=new AddData();

        int choice;
        Scanner scan=new Scanner(System.in);

        do{
            System.out.println("STUDENT DETAILS - MENU");
            System.out.println("\t1. Add Student Data");
            System.out.println("\t2. Print the ArrayList");
            System.out.println("\t3. Insert an Element");
            System.out.println("\t4. Remove an Element");
            System.out.println("\t5. Search a Student");
            System.out.println("\t6. Copy the ArrayList to Another.");
            System.out.println("\t7. Update an Element");
            System.out.println("\t8. Sort the Data by Name");
            System.out.println("\t9. Shuffle Student Info.");
            System.out.println("\t10. Update an Element.");
            System.out.println("\t11. Swap Student Info.");
            System.out.println("\t12. Extract a Portion of the Student Info");
            System.out.println("\t13. Increase the Size of the ArrayList");
            System.out.println("\t14. Join Two ArrayLists");
            System.out.println("\t15. Clear the ArrayList");
            System.out.println("\t16. Check If the ArrayList is Empty");
            System.out.println("\t17. Exit");
//          
//           
//           
//           
//           
            System.out.println("Enter your choice:");
            choice= scan.nextInt();
            switch (choice){
                case 1:
                    addstud.addData();
                    break;
                case 2:
                    PrintData.printData(addstud.getStudent());
                    break;
                case 3:
                    addstud.insertData();
                    break;
                case 4:
                    addstud.removeData();
                    break;
                case 5:
                    addstud.searchStudent();
                    break;
                case 6:
                    addstud.copyStudentArray();
                    break;
                case 7:
                    addstud.updateStudent();
                    break;
                case 8:
                    addstud.sortData();
                    break;
                case 9:
                    addstud.shuffleData();
                    break;
                case 10:
                    addstud.reverseData();
                    break;
                case 11:
                    addstud.swapData();
                    break;
                case 12:
                    addstud.extractData();
                    break;
                case 13:
                    addstud.increaseSize();
                    break;
                case 14:
                    addstud.joinArrayLists();
                    break;
                case 15:
                    addstud.emptyList();
                    break;
                case 16:
                    addstud.checkEmptyList();
                    break;
                case 17:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!");

            }

        }while (choice<=21);
    }
}