package Collection.Map;

public class Denomination {
    private Character firstWord;
    private String name;
    private Integer age;
    public Denomination(Character firstWord , Integer age ,String name){
        this.firstWord = firstWord;
        this.name = name;
        this.age = age;
    }

    public void setFirstWord(Character firstWord) {
        this.firstWord = firstWord;
    }

    public Character getFirstWord() {
        return firstWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object denomination) {
        Denomination denomination1 = (Denomination) denomination;
        if((this.firstWord.equals(denomination1.getFirstWord()) || this.age.equals(denomination1.getAge())) && this.name.startsWith(String.valueOf(denomination1.getName().charAt(0)))){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Denomination first = new Denomination('P' , 33 , "Prakash");
        Denomination second = new Denomination('P' , 33 , "Prashant");
        Denomination third = new Denomination('V' , 32 , "Vikram");
        Denomination fourth = new Denomination('M' , 32 , "Vikram");
        Denomination fifth = new Denomination('K' , 30 , "Prakash");
        System.out.println(first.equals(second));
        System.out.println(third.equals(fourth));
        System.out.println(first.equals(fifth));


    }
}
