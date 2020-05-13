public abstract class AbstractEntity {

    public int id;
    private int nextId = 0;

    public AbstractEntity(){
        this.id = nextId;
        nextId ++;
    }

    public int getId () {
        return this.id;
    }

}
