import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10; // 최소한의 크기
    private static final Object[] EMPTY_ARRAY = {}; // 빈 배열

    private int size; // 요소 개수
    Object[] array;

    // 생성자1 초기 공간 할당 X
    public ArrayList() {
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }

    // 생성자2 초기 공간 할당 O

    public ArrayList(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    @Override
    public boolean add(E value) {
        addLast(value);

        return true;
    }

    public void addLast(E value) {
        if (size == array.length) {
            resize();
        }
        array[size] = value;
        size++;
    }

    @Override
    public void add(int index, E value) {

        // 리스트의 범위를 벗어나는 index일 경우 예외 발생
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        // index가 size와 같다는 것은
        // 리스트 마지막에 추가한다는 것과 같은 의미
        if (index == size) {
            addLast(value);
        } else {
            // size가 리스트의 크기와 같다는 것은
            // 요소가 한개 더 들어오게 되면
            // 공간이 가득 차기 때문에 resize() 실행
            if (size == array.length) {
                resize();
            }

            // 초기 값을 마지막 요소 다음을 나타내는 size로
            // 설정하고, i가 index 보다 클 동안
            // 감소 연산자를 통해 요소들의 기존 위치에서
            // 한칸씩 뒤로 밀어준다.
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }

            // index의 위치에 있던 요소가
            // index + 1의 위치로 밀어졌기 때문에
            // index 위치에 요소 삽입
            array[index] = value;

            // 다음 요소가 들어올 것을 대비하여 size 증가
            size++;
        }
    }

    public void addFirst(E value) {
        add(0, value);
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(E value) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E value) {

    }

    @Override
    public boolean contains(E value) {
        return false;
    }

    @Override
    public int indexOf(E value) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    private void resize() {
        int array_capacity = array.length;

        // EMPTY_ARRAY는 빈배열
        // 생성자를 통해 생성한 array가 빈 배열이면
        // array의 최소 크기를 나타내
        // DEFAULT_CAPACITY(10) 으로 설정한다.
        // 주소가 아닌 값을 비교해야 하기 때문에
        // Arrays.equals()를 사용
        if (Arrays.equals(array, EMPTY_ARRAY)) {
            array = new Object[DEFAULT_CAPACITY];
            return;
        }

        // 용량이 꽉 찰 경우
        // 리스트에 들어있는 요소의 개수를 나타내는
        // size가 array의 크기와 같아질 경우
        // array가 꽉찬 것을 의미하기 때문에
        // 새롭게 array의 크기를 늘려야한다.
        if (size == array_capacity) {
            int new_capacity = array_capacity * 2;

            // copyOf(복사할 배열, 새롭게 생성할 배열의 크기)
            // 복사할 배열보다 용적 크기가 클 경우 배열을 복사한 뒤
            // 나머지 공간을 null로 채운다.
            array = Arrays.copyOf(array, new_capacity);
            return;
        }

        // 메모리 공간을 불필요하게 차지하는 것을 방지하기 위해
        // 데이터의 개수가 용적 크기의 절반미만이면
        // 용적크기를 절반으로 줄인다.
        if (size < (array_capacity / 2)) {
            int new_capacity = array_capacity / 2;

            array = Arrays.copyOf(array, Math.max(new_capacity, DEFAULT_CAPACITY));
            return;
        }
    }
}
