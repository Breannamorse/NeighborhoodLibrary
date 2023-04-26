import java.util.Scanner;

public class NeighboorhoodLibrary {
    private static Book[] books = new Book[5];

    public static void main(String[] args) {




        Book book1 = new Book(3434, "454435", "The Reaper");
        Book book2 = new Book(3434, "453465", "The Tree");
        Book book3 = new Book(4555, "353545", "The Sea");
        Book book4 = new Book(44545, "45455", "The Ocean");
        Book book5 = new Book(445455, "4353445", "The Sand");

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        Scanner scanner = new Scanner(System.in);

        boolean checkedOut = false;
        while (!checkedOut) {
            System.out.println("Pick an option");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("Exit - Close out of application");

            int command = scanner.nextInt();

            scanner.nextLine();

            switch (command) {
                case 1:
                    for (int i = 0; i < books.length; i++) {
                        System.out.println(books[i].getId() + " | " + books[i].getIsbn() + " | " + books[i].getTitle());

                    }
                    System.out.println("Select an option");
                    System.out.println("Select 1 to choose a book");
                    System.out.println("Select 2 to exit to home screen");

                    int Scanner = scanner.nextInt();
                    if (Scanner.equals("1")) {
                        System.out.println("Username: ");
                        String userName = scanner.next();

                        System.out.println("What book would you like?");
                        int userBook = scanner.nextInt();

                        for (int i = 0; i < books.length; i++) {
                            if (userBook == books[i].getId()) {
                                books[i].checkOut(userName);
                                System.out.println("Book" + books[i].getTitle() + "Has been checked out by" + userName);
                            }

                        }
                    }
                    if (Scanner.equals(checkedOut))
                        break;
            }


        }
    }
}
