public class Author
{
    private int birth;
    private String name;

    public Author(){
        birth = 0;
        name = "";
    }

    public Author(int birth, String name){
        this.birth = birth;
        this.name = name;
    }

    //Precondition: Author and name are defined;
    //Postcondition: Returns the name of the author
    public String getName(){
        return name;
    }

    //Precondition: Author and newName are defined;
    //Postcondition: sets the name of the author to a new author
    public void setName(String newName){
        name = newName;
    }

    //Precondition: Author and birth is defined
    //Postcondition: Returns the birth year of the author
    public int getBirth(){
        return birth;
    }

    //Precondition: Author and newBirth are defined
    //Postcondition: sets the birth of the author to the new author
    public void setBirth(int newBirth){
        birth = newBirth;
    }
}
