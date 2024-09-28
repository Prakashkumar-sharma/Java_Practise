package Collection.Map;

public class Flats {
    private Integer flatNo;
    private String name;
    private Character block;


    public Flats(Integer flatNo , String name , Character block ){
        this.flatNo = flatNo;
        this.name = name;
        this.block = block;
    }
    public void setFlatNo(Integer flatNo) {
        this.flatNo = flatNo;
    }

    public Integer getFlatNo() {
        return flatNo;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setBlock(Character block) {
        this.block = block;
    }

    public Character getBlock() {
        return block;
    }

    @Override
    public boolean equals(Object flat ) {
        Flats flatNo1 = (Flats) flat;
        if((this.flatNo.equals(flatNo1.getFlatNo()) || this.name.equals(flatNo1.getName())) && (this.block.equals(flatNo1.getBlock()))){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Flats flat1 = new Flats(404 , "Vikram" , 'D');
        Flats flat2 = new Flats(404 , "Akshay" , 'D');
        Flats flat3 = new Flats(405 , "Prakash" , 'D');
        Flats flat4 = new Flats(404 , "Shubham" , 'A');
        Flats flat5 = new Flats(405 , "Prakash" , 'M');
        System.out.println(flat1.equals(flat2));
        System.out.println(flat2.equals(flat4));
        System.out.println(flat3.equals(flat5));

    }
}
