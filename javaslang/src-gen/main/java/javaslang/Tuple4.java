/*     / \____  _    _  ____   ______  / \ ____  __    _______
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  //  /\__\   JΛVΛSLΛNG
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/ \ /__\ \   Copyright 2014-2016 Javaslang, http://javaslang.io
 * /___/\_/  \_/\____/\_/  \_/\__\/__/\__\_/  \_//  \__/\_____/   Licensed under the Apache License, Version 2.0
 */
package javaslang;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javaslang.collection.Iterator;
import javaslang.collection.List;
import javaslang.collection.Seq;

/**
 * A tuple of 4 elements which can be seen as cartesian product of 4 components.
 *
 * @param <T1> type of the 1st element
 * @param <T2> type of the 2nd element
 * @param <T3> type of the 3rd element
 * @param <T4> type of the 4th element
 * @author Daniel Dietrich
 * @since 1.1.0
 */
public final class Tuple4<T1, T2, T3, T4> implements Tuple, Comparable<Tuple4<T1, T2, T3, T4>>, Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The 1st element of this tuple.
     */
    public final T1 _1;

    /**
     * The 2nd element of this tuple.
     */
    public final T2 _2;

    /**
     * The 3rd element of this tuple.
     */
    public final T3 _3;

    /**
     * The 4th element of this tuple.
     */
    public final T4 _4;

    /**
     * Constructs a tuple of 4 elements.
     *
     * @param t1 the 1st element
     * @param t2 the 2nd element
     * @param t3 the 3rd element
     * @param t4 the 4th element
     */
    public Tuple4(T1 t1, T2 t2, T3 t3, T4 t4) {
        this._1 = t1;
        this._2 = t2;
        this._3 = t3;
        this._4 = t4;
    }

    public static <T1, T2, T3, T4> Comparator<Tuple4<T1, T2, T3, T4>> comparator(Comparator<? super T1> t1Comp, Comparator<? super T2> t2Comp, Comparator<? super T3> t3Comp, Comparator<? super T4> t4Comp) {
        return (Comparator<Tuple4<T1, T2, T3, T4>> & Serializable) (t1, t2) -> {
            final int check1 = t1Comp.compare(t1._1, t2._1);
            if (check1 != 0) {
                return check1;
            }

            final int check2 = t2Comp.compare(t1._2, t2._2);
            if (check2 != 0) {
                return check2;
            }

            final int check3 = t3Comp.compare(t1._3, t2._3);
            if (check3 != 0) {
                return check3;
            }

            final int check4 = t4Comp.compare(t1._4, t2._4);
            if (check4 != 0) {
                return check4;
            }

            // all components are equal
            return 0;
        };
    }

    @SuppressWarnings("unchecked")
    private static <U1 extends Comparable<? super U1>, U2 extends Comparable<? super U2>, U3 extends Comparable<? super U3>, U4 extends Comparable<? super U4>> int compareTo(Tuple4<?, ?, ?, ?> o1, Tuple4<?, ?, ?, ?> o2) {
        final Tuple4<U1, U2, U3, U4> t1 = (Tuple4<U1, U2, U3, U4>) o1;
        final Tuple4<U1, U2, U3, U4> t2 = (Tuple4<U1, U2, U3, U4>) o2;

        final int check1 = t1._1.compareTo(t2._1);
        if (check1 != 0) {
            return check1;
        }

        final int check2 = t1._2.compareTo(t2._2);
        if (check2 != 0) {
            return check2;
        }

        final int check3 = t1._3.compareTo(t2._3);
        if (check3 != 0) {
            return check3;
        }

        final int check4 = t1._4.compareTo(t2._4);
        if (check4 != 0) {
            return check4;
        }

        // all components are equal
        return 0;
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    public int compareTo(Tuple4<T1, T2, T3, T4> that) {
        return Tuple4.compareTo(this, that);
    }

    /**
     * Getter of the 1st element of this tuple.
     *
     * @return the 1st element of this Tuple.
     */
    public T1 _1() {
        return _1;
    }

    /**
     * Getter of the 2nd element of this tuple.
     *
     * @return the 2nd element of this Tuple.
     */
    public T2 _2() {
        return _2;
    }

    /**
     * Getter of the 3rd element of this tuple.
     *
     * @return the 3rd element of this Tuple.
     */
    public T3 _3() {
        return _3;
    }

    /**
     * Getter of the 4th element of this tuple.
     *
     * @return the 4th element of this Tuple.
     */
    public T4 _4() {
        return _4;
    }

    /**
     * Maps the components of this tuple using a mapper function.
     *
     * @param mapper the mapper function
     * @param <U1> new type of the 1st component
     * @param <U2> new type of the 2nd component
     * @param <U3> new type of the 3rd component
     * @param <U4> new type of the 4th component
     * @return A new Tuple of same arity.
     * @throws NullPointerException if {@code mapper} is null
     */
    public <U1, U2, U3, U4> Tuple4<U1, U2, U3, U4> map(Function4<? super T1, ? super T2, ? super T3, ? super T4, Tuple4<U1, U2, U3, U4>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return mapper.apply(_1, _2, _3, _4);
    }

    /**
     * Maps the components of this tuple using a mapper function for each component.
     *
     * @param f1 the mapper function of the 1st component
     * @param f2 the mapper function of the 2nd component
     * @param f3 the mapper function of the 3rd component
     * @param f4 the mapper function of the 4th component
     * @param <U1> new type of the 1st component
     * @param <U2> new type of the 2nd component
     * @param <U3> new type of the 3rd component
     * @param <U4> new type of the 4th component
     * @return A new Tuple of same arity.
     * @throws NullPointerException if one of the arguments is null
     */
    public <U1, U2, U3, U4> Tuple4<U1, U2, U3, U4> map(Function<? super T1, ? extends U1> f1, Function<? super T2, ? extends U2> f2, Function<? super T3, ? extends U3> f3, Function<? super T4, ? extends U4> f4) {
        Objects.requireNonNull(f1, "f1 is null");
        Objects.requireNonNull(f2, "f2 is null");
        Objects.requireNonNull(f3, "f3 is null");
        Objects.requireNonNull(f4, "f4 is null");
        return Tuple.of(f1.apply(_1), f2.apply(_2), f3.apply(_3), f4.apply(_4));
    }

    /**
     * Maps the 1st component of this tuple to a new value.
     *
     * @param <U> new type of the 1st component
     * @param mapper A mapping function
     * @return a new tuple based on this tuple and substituted 1st component
     */
    public <U> Tuple4<U, T2, T3, T4> map1(Function<? super T1, ? extends U> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        final U u = mapper.apply(_1);
        return Tuple.of(u, _2, _3, _4);
    }

    /**
     * Maps the 2nd component of this tuple to a new value.
     *
     * @param <U> new type of the 2nd component
     * @param mapper A mapping function
     * @return a new tuple based on this tuple and substituted 2nd component
     */
    public <U> Tuple4<T1, U, T3, T4> map2(Function<? super T2, ? extends U> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        final U u = mapper.apply(_2);
        return Tuple.of(_1, u, _3, _4);
    }

    /**
     * Maps the 3rd component of this tuple to a new value.
     *
     * @param <U> new type of the 3rd component
     * @param mapper A mapping function
     * @return a new tuple based on this tuple and substituted 3rd component
     */
    public <U> Tuple4<T1, T2, U, T4> map3(Function<? super T3, ? extends U> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        final U u = mapper.apply(_3);
        return Tuple.of(_1, _2, u, _4);
    }

    /**
     * Maps the 4th component of this tuple to a new value.
     *
     * @param <U> new type of the 4th component
     * @param mapper A mapping function
     * @return a new tuple based on this tuple and substituted 4th component
     */
    public <U> Tuple4<T1, T2, T3, U> map4(Function<? super T4, ? extends U> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        final U u = mapper.apply(_4);
        return Tuple.of(_1, _2, _3, u);
    }

    /**
     * Transforms this tuple to an object of type U.
     *
     * @param f Transformation which creates a new object of type U based on this tuple's contents.
     * @param <U> type of the transformation result
     * @return An object of type U
     * @throws NullPointerException if {@code f} is null
     */
    public <U> U apply(Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends U> f) {
        Objects.requireNonNull(f, "f is null");
        return f.apply(_1, _2, _3, _4);
    }

    /**
     * Transforms this tuple to an object of type U.
     *
     * @deprecated Use {@link #apply(Function4)} instead, will be removed in 3.0.0
     * @param f Transformation which creates a new object of type U based on this tuple's contents.
     * @param <U> type of the transformation result
     * @return An object of type U
     * @throws NullPointerException if {@code f} is null
     */
    @Deprecated(/* Use apply instead, will be removed in 3.0.0 */)
    public <U> U transform(Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends U> f) {
        Objects.requireNonNull(f, "f is null");
        return f.apply(_1, _2, _3, _4);
    }

    @Override
    public Seq<?> toSeq() {
        return List.of(_1, _2, _3, _4);
    }

    // -- Object

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Tuple4)) {
            return false;
        } else {
            final Tuple4<?, ?, ?, ?> that = (Tuple4<?, ?, ?, ?>) o;
            return Objects.equals(this._1, that._1)
                  && Objects.equals(this._2, that._2)
                  && Objects.equals(this._3, that._3)
                  && Objects.equals(this._4, that._4);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(_1, _2, _3, _4);
    }

    @Override
    public String toString() {
        return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ")";
    }

    public static <T1, T2, T3, T4> Tuple4<Seq<? extends T1>, Seq<? extends T2>, Seq<? extends T3>, Seq<? extends T4>> sequence(Iterable<Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> tuples) {
      Objects.requireNonNull(tuples, "tuples is null");
      return new Tuple4<>(Iterator.ofAll(tuples).map(Tuple4::_1).toList(), Iterator.ofAll(tuples).map(Tuple4::_2).toList(), Iterator.ofAll(tuples).map(Tuple4::_3).toList(), Iterator.ofAll(tuples).map(Tuple4::_4).toList());
    }
}