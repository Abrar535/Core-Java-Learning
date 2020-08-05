package PatternMatchingForInstanceOf;

public class ChildClass extends ParentClass{
    private int childId ;
    private String childName;

    public ChildClass() {
        super();
    }

    public ChildClass(int childId, String childName) {
        this.childId = childId;
        this.childName = childName;
    }

    public ChildClass(int parentId, int parentName, int childId, String childName) {
        super(parentId, parentName);
        this.childId = childId;
        this.childName = childName;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String name(){
        return "I am child class";

    }
}
