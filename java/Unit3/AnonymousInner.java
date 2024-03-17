/**
 * AnonymousInner
 */
abstract class AnonymousInner {

    public abstract void mymethod();
}
class OuterClass
{
    public static void main(String args[]) {
        AnonymousInner obj=new AnonymousInner(){
        public void mymethod()
        {
            System.out.println("This is an example of annonymous inner class");
        }
    };
    obj.mymethod();
}
}