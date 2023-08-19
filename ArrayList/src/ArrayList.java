public class ArrayList {

    // index 겸 리스트 size를 나타내는 용도
    int size = 0;

    // 임시로 100개의 요소를 가질 수 있는 객체 배열 생성
    Object[] data = new Object[100];

    // 리스트 마지막에 요소 추가
    public void add(Object element) {
        // 저장할 요소를 매개변수로 받아 현재 index(size)에 저장
        data[size] = element;

        // 다음 add method()가 호출될 경우
        // 다음 index에 저장해야하기 때문에 size++
        size++;

        // 블로그에선 반환 타입을 boolean으로 설정하여 true를 반환해 주었지만
        // 필요성을 못느껴서 반환타입을 void로 설정
        // return true;
    }

    // 리스트 중간에 요소 추가
    public Object add(int index, Object element) {

        // index 번째에 요소 추가하게 되면
        // 해당 index에 있던 요소는 뒤로 한칸씩 밀려야 하기 때문에
        // for문의 초기 값을 마지막 요소가 들어있는 index로 설정하고
        // for문이 실행되는 동안 해당 index에 위치한 값들을
        // index+1의 위치에 저장해주고 넣으려고 했던
        // index자리의 요소까지 한칸씩 미룰때 까지 for문을 진행한다.
        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }

        // 이전에 저장되어있던 요소들이 모두 한칸씩 뒤로 밀려난 이후
        // 넣으려고했던 index자리에 넣으려한 요소를 넣는다.
        data[index] = element;

        // 그 이후 요소가 한개 늘어났기 때문에 다음에 들어올 요소를 대비하여
        // size 값을 증가
        size++;

        return element;
    }

    // 리스트내 모든 요소 출력
    public void arrToString() {
        // 요소가 한개라도 있다면 출력
        if (size > 0) {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                // data(ArrayList)의 i번째 인덱스 출력
                System.out.print(data[i]);
                // 인덱스 + 1 == size 이면 마지막 요소이기 때문에
                // 마지막 요소의 뒤에 공백(space)를 넣지 않는다.
                if (i + 1 == size) {
                    break;
                } else System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    // index 번호로 한개 요소 찾기
    public Object findByIndex(int index) {

        if(data[index] != null) {
            return data[index];
        } else {
            return null;
        }
    }

    // element가 arrList에 몇번째 index에 포함되어 있는지 찾기
    public int findByElementIndex(Object element) {
        int index = -1;
        for (int i = 0; i < size; i++) {

            // element가 arraylist[i] 요소와 같다면 arraylist의 index번호를 return
            if (data[i].equals(element)) {
                return i;

            }
        }
        // 요소가 포함되어 있지 않다면 -1을 return
        return index;

    }

    // index번째 요소 삭제
    public void remove(int index) {

        // 매개변수로 받은 index를 삭제할 필요 없이
        // 뒤의 요소들을 한칸씩 앞으로 당기면 되기 때문에
        // 반복문의 시작을 index+1로 지정해준다.
        for (int i = index + 1; i < size; i++) {

            // 삭제할 요소 다음 요소들을 한칸씩 앞으로 당기는 코드
            data[i - 1] = data[i];
        }

        // 마지막 요소의 자리를 null 값으로 바꿔주고
        // size도 감소시켜준다.
        data[--size] = null;
    }

    // 리스트의 길이
    public int size() {

        // index가 0부터 시작하기 때문에
        // size를 그대로 반환하면 list의 길이로 표현할 수 있다.
        return size;
    }

    public class ListIterator {
        private int nextIndex = 0;

        public boolean hasNext() {

            // List의 크기가 nextIndex보다 작은 경우에만
            // 다음 요소를 찾을 수 있다.
            return nextIndex < size();
        }

        // 순차적으로 엘리먼트를 탐색해서 return
        public Object next() {

            // 현재 요소 return 후 다음 요소 return을 위해 ++연산자 사용
            return data[nextIndex++];
        }

        // previous method를 호출해도 되는지 체크
        public boolean hasPrevious() {

            // index가 0이면 이전 요소는 존재하지 않기 때문에 false
            return nextIndex > 0;
        }

        // 이전 요소 리턴
        public Object previous() {

            // nextIndex는 다음 요소를 찾기 위해 +1되어 있기때문에ㅔ
            // --감소 연산자를 통해 현재 요소를 return
            return data[--nextIndex];
        }

        // 현재 엘리먼트를 추가
        public void add(Object element) {
            ArrayList.this.add(nextIndex++, element);
        }

        // 햔제 엘리먼트 삭제
        public void remove() {
            ArrayList.this.remove(nextIndex-1);
            nextIndex--;
        }
    }
}
