package PatternMatchingForInstanceOf;

public class ParentClass {

    private int parentId;
    private int parentName;

    public ParentClass() {
    }

    public ParentClass(int parentId, int parentName) {
        this.parentId = parentId;
        this.parentName = parentName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getParentName() {
        return parentName;
    }

    public void setParentName(int parentName) {
        this.parentName = parentName;
    }

    public String name(){
        return "I am parent class";
    }
    public String alternateName(){
        return "I am parent-alternate class";
    }


}
