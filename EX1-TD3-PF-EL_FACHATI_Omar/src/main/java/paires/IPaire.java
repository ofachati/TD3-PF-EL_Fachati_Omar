package paires;

public interface IPaire<A,B> {
    A fst();
    B snd();
    <C> IPaire<C,B> changeFst(C value);
    <C> IPaire<A,C> changeSnd(C value);
}
