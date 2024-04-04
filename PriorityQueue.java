/**
 * interfaz para la cola del vectorHeap 
 * @author libro de texto "Java Structures de Duane Bailey"
 */
public interface PriorityQueue<E extends Comparable<E>>
{
    /**
     * // pre: !isEmpty()
	// post: returns the minimum value in priority queue
     * @return first value
     */
	public E getFirst();
	
	/**
     * // pre: !isEmpty()
	// post: returns and removes minimum value from queue
     * @return value removed
     */
	public E remove();
	
    /**
     * // pre: value is non-null comparable
	// post: value is added to priority queue
     * @param value new value
     */
	public void add(E value);
	
    /**
     * // post: returns true iff no elements are in queue
     * @return true if empty
     */
	public boolean isEmpty();
	
    /**
     * // post: returns number of elements within queue
     * @return size of queue
     */
	public int size();
	
    /**
     * // post: removes all elements from queue
     */
	public void clear();
}
