package paires;

public class Paire<A,B> implements IPaire<A,B> {
    private A _fst;
    private B _snd;

    public Paire(final A fst, final B snd) {
        _fst = fst;
        _snd = snd;
    }

    @Override
    public A fst() { return _fst; }

    @Override
    public B snd() { return _snd; }

    @Override
    public String toString() { return String.format("(%s, %s) :: Paire[%s,%s]", _fst, _snd, _fst.getClass().getSimpleName(), _snd.getClass().getSimpleName()); }

    @Override
    public <C> IPaire<C,B> changeFst(C val) { return new Paire<>(val, _snd); }

    @Override
    public <C> IPaire<A,C> changeSnd(C val) { return new Paire<>(_fst, val); }

}
