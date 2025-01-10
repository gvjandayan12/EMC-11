package Project;
import java.util.Scanner;

class Books extends sample{

    String action; String romance; String fantasy; String scifi;
    String title;
    String[] fantasy_books = {"Magis", "Momonoke", "Howl's Moving Castle", "The Cat Returns"};
    String[] action_books = {"One Piece", "Demon Slayer", "Vinland Saga", "Tokyo Revengers"};
    String[] romance_books = {"Tsukie ga Kirie", "Takagi-san", "Date a Live", "Violet Evergarden"};
    String[] scifi_books = {"Darling in the Franxx", "Kaiju. No 8", "Terminate Zero", "Sword Art Online"};
    Scanner scanner;

    Books(String action, String romance, String fantasy, String scifi){
        this.action = action;
        this.romance = romance;
        this.fantasy = fantasy;
        this.scifi = scifi;
    } 
    
    Books(String title){
        this.title = title;
    }

    void actionBooks(){
        
        scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Action List : " + "\n" + "[1] = " + action_books[0] + "\n"
        + "[2] = " + action_books[1] + "\n" + "[3] = " + action_books[2] + "\n" 
        + "[4] = " + action_books[3]);
        System.out.println("--------------------------------------------------------------------");

        System.out.println();
        
        while(true){
            try{
                System.out.print("Select Book : ");
                String select_book = scanner.nextLine();
                AlphabetException(select_book);
                System.out.println(select_book);

                if(select_book.equalsIgnoreCase(action_books[0])){
                    
                }
                else if(select_book.equalsIgnoreCase(action_books[1])){

                }
                else if(select_book.equalsIgnoreCase(action_books[2])){

                }
                else if(select_book.equalsIgnoreCase(action_books[3])){

                }
                else if(!select_book.equalsIgnoreCase(action_books[0]) && !select_book.equalsIgnoreCase(action_books[1])
                && !select_book.equalsIgnoreCase(action_books[2]) && !select_book.equalsIgnoreCase(action_books[3])){
                    System.out.println("Book Not Found!");
                    continue;
                }

                break;
            }
            catch(CustomException e){
                System.out.println("Please input valid");
                e.printStackTrace();
                continue;
            }
        }

    }
    
    void fantasyBooks(){


        System.out.println("--------------------------------------------------------------------");
        System.out.println("Fantasy List : " + "\n" + "[1] = " + fantasy_books[0] + "\n"
        + "[2] = " + fantasy_books[1] + "\n" + "[3] = " + fantasy_books[2] + "\n" + "[4] = "
        + fantasy_books[3]);
        System.out.println("--------------------------------------------------------------------");
    }

    void romanceBooks(){
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Romance List : " + "\n" + "[1] = " + romance_books[0] + "\n"
        + "[2] = " + romance_books[1] + "\n" + "[3] = " + romance_books[2] + "\n" + 
        "[4] = " + romance_books[3]);
        System.out.println("--------------------------------------------------------------------");
    }

    void scifiBooks(){
        

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Sci-Fi List : " + "\n" + "[1] = " + scifi_books[0] + "\n" + 
        "[2] = " + scifi_books[1] + "\n" + "[3] = " + scifi_books[2] + "\n" + 
        "[4] = " + scifi_books[3]);
        System.out.println("--------------------------------------------------------------------");
    }

}
class Genre extends Books{
    Genre(String title){
    super(title);

    }
    void genreBooks(){
        super.actionBooks();
        super.romanceBooks();
        super.fantasyBooks();
        super.scifiBooks();
    }
}

class CustomException extends Exception{
    public CustomException(String recieve){
        super(recieve);
    }
}

public class sample{
    public static void main(String[] args) throws CustomException{
        Scanner scanner = new Scanner(System.in);
        Books book = new Books("Action", "Romance", "Fantasy", "SciFi");
        String add = "ADD BOOKS"; String delete = "DELETE BOOKS"; String update = "UPDATE BOOKS"; String listOfBooks = "LIST OF BOOKS";

        System.out.println("[1] = " + add + "\n" + 
        "[2] = " + delete + "\n" + "[3] = " + update + "\n" + 
        "[4] = " + listOfBooks); System.out.println();

        while(true){
            System.out.print("Select Option : ");
            String option = scanner.nextLine();

            AlphabetException(option);
            if(option.equalsIgnoreCase(add)){
                while(true){
                    try{
                        System.out.print("(TYPE STOP TO QUIT) ADD BOOKS : ");
                        String addBooks = scanner.nextLine();

                        AlphabetException(addBooks);
                        
                        System.out.println("What genre : ");
                        String what_genre = scanner.nextLine();

                        if(what_genre.equalsIgnoreCase(book.action)){
                            
                            

                            for(String num : book.action_books){
                                System.out.println(num);
                            }



                        }
                        else if(what_genre.equalsIgnoreCase(book.fantasy)){

                        }
                        else if(what_genre.equalsIgnoreCase(book.romance)){

                        }
                        else if(what_genre.equalsIgnoreCase(book.scifi)){

                        }
                    }
                    catch(CustomException error){
                        System.out.println("TRY AGAIN!");
                        error.printStackTrace();
                        continue;
                    }
                    break;
                }
            }
            else if(option.equalsIgnoreCase(delete)){

            }
            else if(option.equalsIgnoreCase(update)){

            }
            else if(option.equalsIgnoreCase(listOfBooks)){
                while(true){
                    try{
                        System.out.println("SELECT GENRE : " + "\n" + "[1] = " + book.action + "\n"
                        + "[2] = " + book.fantasy + "\n" + "[3] = " + book.romance + "\n" +
                        "[4] = " + book.scifi); System.out.println();
        
                        System.out.print("Enter genre : ");
                        String genre = scanner.nextLine();
        
                        AlphabetException(genre);
        
                        //Action List
                        if(genre.equalsIgnoreCase(book.action)){
        
                            System.out.println(book.action + " selected!");
        
                            Genre GENRE = new Genre(genre);
                            
                            GENRE.actionBooks();
                            
                            break;
                        }
                        
                        //Fantasy List
                        else if(genre.equalsIgnoreCase(book.fantasy)){
                            System.out.println(book.fantasy + " selected!");
        
                            Genre GENRE = new Genre(genre);
        
                            GENRE.fantasyBooks();
                            break;
                        }
        
                        //Romance List
                        else if(genre.equalsIgnoreCase(book.romance)){
                            System.out.println(book.romance + " selected!");
        
                            Genre GENRE = new Genre(genre);
        
                            GENRE.romanceBooks();
                            break;
                        }
        
                        //Sci-Fi List
                        else if(genre.equalsIgnoreCase(book.scifi)){
                            System.out.println(book.scifi + " selected!");
        
                            Genre GENRE = new Genre(genre);
        
                            GENRE.scifiBooks();
                            break;
                        }
                        else if(!genre.equals(book.action)){
                            System.out.println("Icnorrrect genre");
                            continue;
                        }
                        else if(!genre.equals(book.fantasy)){
                            System.out.println("Icnorrrect genre");
                            continue;
                        }
                        else if(!genre.equals(book.romance)){
                            System.out.println("Icnorrrect genre");
                            continue;
                        }
                        else if(!genre.equals(book.scifi)){
                            System.out.println("Icnorrrect genre");
                            continue;
                        }
        
                        scanner.close();
        
                    }catch(CustomException error){


                        System.out.println("Error");
                        error.printStackTrace();
                        continue;
                    }
                    break;
                }
            }
            else if(!option.equals(add) && !option.equalsIgnoreCase(delete) && !option.equalsIgnoreCase(update)
            && !option.equals(listOfBooks)){
                System.out.println("Please copy the specific option");
                continue;
            }
            break;
        }
        

    }
    static void AlphabetException(String value) throws CustomException{
        if(!value.matches("[a-z A-Z]+")){
            throw new CustomException("Please alphabet only");
        }
    }
}