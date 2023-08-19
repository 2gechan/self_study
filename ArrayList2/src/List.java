// 어떤 타입의 요소가 들어올지 모르니 generic 사용
public interface List<E> {

    /*
     * 매개변수 : 추가할 E 타입의 value 요소
     * return : 요소 추가에 성공하면 true 반환, 실패시 false
     */
    boolean add(E value);

    /*
     * 매개변수 index : 요소를 추가할 index 위치
     * 매개변수 value : index 위치에 추가할 E 타입의 value 요소
     */
    void add(int index, E value);

    /*
     * 매개변수 : 삭제할 요소 위치
     * return : 삭제한 E 타입 요소
     */
    E remove(int index);

    /*
     * 매개변수 : 삭제할 요소
     * return : 삭제에 성공하면 true 반환, 실패시 false
     */
    boolean remove(E value);

    /*
     * 매개변수 : 가져올 요소 위치
     * return : 가져온 E 타입 요소
     */
    E get(int index);

    /*
     * 매개변수 index : 변경할 요소의 index 위치
     * 매개변수 value : 변경할 요소
     */
    void set(int index, E value);

    /*
     * 매개변수 : E 타입의 value 요소가 리스트에 포함되어 있는지
     * return : 포함되어 있다면 true 반환, 실패시 false
     */
    boolean contains(E value);

    /*
     * 매개변수 : 찾으려는 E 타입의 value 요소
     * return : 찾으려는 요소의 index 위치
     */
    int indexOf(E value);

    /*
     * return : List의 크기
     */
    int size();

    /*
     * return : List에 요소가 한개라도 있다면 true 반환
     *          없다면 false
     */
    boolean isEmpty();

    /*
     * List의 모든 요소 삭제
     */
    public void clear();
}
