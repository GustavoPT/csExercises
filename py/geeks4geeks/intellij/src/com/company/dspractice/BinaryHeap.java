package com.company.dspractice;

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Arrays;

public class BinaryHeap<AnyType>
{
    private static final int DEFAULT_CAPACITY = 10;

    private int currentSize;      // Number of elements in heap
    private AnyType [ ] array; // The heap array
    private Comparator<? super AnyType> cmp;

    public BinaryHeap()
    {
        this( DEFAULT_CAPACITY );
    }

    public BinaryHeap( int capacity )
    {
        this( null, capacity );
    }

    public BinaryHeap( Comparator<? super AnyType> c )
    {
        this( c, DEFAULT_CAPACITY );
    }

    public BinaryHeap( Comparator<? super AnyType> c, int capacity )
    {
        currentSize = 0;
        array = (AnyType[]) new Comparable[ capacity + 1 ];
        cmp = c;
    }

    public BinaryHeap( AnyType [ ] items )
    {
        this( items, null );
    }

    public BinaryHeap( AnyType [ ] items, Comparator<? super AnyType> c )
    {
        cmp = c;
        currentSize = items.length;
        array = (AnyType[]) new Object[ ( currentSize + 2 ) * 11 / 10 ];

        int i = 1;
        for( AnyType item : items )
            array[ i++ ] = item;
        buildHeap( );
    }
    private int myCompare( AnyType lhs, AnyType rhs )
    {
        if( cmp != null )
            return cmp.compare( lhs, rhs );
        else
            return ((Comparable)lhs).compareTo( rhs );
    }

    public void insert( AnyType x )
    {
        if( currentSize == array.length - 1 )
            enlargeArray( array.length * 2 + 1 );

        // Percolate up
        int hole = ++currentSize;
        for( ; hole > 1 && myCompare( x, array[ hole / 2 ] ) < 0; hole /= 2 )
            array[ hole ] = array[ hole / 2 ];
        array[ hole ] = x;
    }

    private void enlargeArray( int newSize )
    {
        AnyType [] old = array;
        array = (AnyType []) new Object[ newSize ];
        for( int i = 0; i < old.length; i++ )
            array[ i ] = old[ i ];
    }

    public AnyType findMin()
    {
        if(isEmpty()){

        }
//            throw new UnderflowException( );
        return array[1];
    }

    public AnyType deleteMin( )
    {
//        if(isEmpty())
//        {
//        }
        AnyType minItem = findMin();
        array[ 1 ] = array[ currentSize-- ];
        percolateDown( 1 );

        return minItem;
    }

    private void buildHeap( )
    {
        for( int i = currentSize / 2; i > 0; i-- )
            percolateDown( i );
    }

    public boolean isEmpty()
    {
        return currentSize == 0;
    }

    public void makeEmpty( )
    {
        currentSize = 0;
    }

    private void percolateDown( int hole )
    {
        int child;
        AnyType tmp = array[ hole ];

        for( ; hole * 2 <= currentSize; hole = child )
        {
            child = hole * 2;
            if( child != currentSize &&
                    myCompare( array[ child + 1 ], array[ child ] ) < 0 )
                child++;
            if( myCompare( array[ child ], tmp ) < 0 )
                array[ hole ] = array[ child ];
            else
                break;
        }
        array[hole] = tmp;
    }

    public static void main( String []args)
    {
        BinaryHeap<Integer> heap = new BinaryHeap<Integer>();
        heap.insert(4);
        heap.insert(6);
        heap.insert(2);
        System.out.println("Heap " + Arrays.toString(heap.array));
    }
}
