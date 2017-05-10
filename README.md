# MyGenInterface
Contains 2 methods for returning the key and value with generic types K and V respectively.

# MyGenClass
Contains instances of K key and V value.
Constructor for initializing key and values.
Implements MyGenInterface, along with its methods.

# MyRegularClass
Contains a public static generic method called getSum that takes in generic variable T that is a child of Number.
Takes two inputs: T inp1 and T inp2.
Returns inp1 of type T.

# MainEntry
Contains instances of MyGenInterface mgi1 and mgi2 that are initialized as MyGenClass variables.
Contains instances of Integer and Float, i1 and f1 respectively, and uses the getSum method.