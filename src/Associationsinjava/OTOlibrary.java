package Associationsinjava;

public class OTOlibrary {
    private String name;
    private String address;
    private String typeofbooks;
    private String wifi;
    private String drinkingwater;
    private OTObooks books;

    public OTOlibrary(String name, String address , String typeofbooks, String wifi , String drinkingwater , OTObooks books){
        this.name = name;
        this.address = address;
        this.typeofbooks = typeofbooks;
        this.wifi = wifi;
        this.drinkingwater = drinkingwater;
        this.books = books;
    }

    public void getLibrarydetail(){
        System.out.println(" Detail of Library ");
        System.out.println(" --------------------- ");
        System.out.println(" Name of Library : " + name);
        System.out.println(" Address : " + address);
        System.out.println(" Facilities :  " + wifi + " & " + drinkingwater);
        System.out.println(" Types of books : " + books.getNovel() + " , " + books.getFiction() + " , " + books.getDrama()+ " , " + books.getHistory() + " , " + books.getGeography() + " , " +  books.getPolity() + " , " + books.getEconomics());
    }

    public static void main(String[] args) {
        OTObooks books = new OTObooks(" 110 novels  " , " 90 fictions " , " 105 dramas " , " World & indian history " , " World & indian geography " , " Indian polity " , " Micro & macro economics " );
        OTOlibrary library = new OTOlibrary(" Pustakalya " , " Mukherjee nagar , Delhi " , " All type of books available " , " Wifi available " , "  RO water available " , books);
        library.getLibrarydetail();
    }
}
