public class SizeExample {
    private /*@ spec_public @*/ int size;

    /*@
      @ ensures \bigint_math((((\result == \old(this.size))) && ((this.size == \old(this.size)))));
      @*/
    public int size() {
        return size;
    }
}
