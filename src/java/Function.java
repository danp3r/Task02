import list.MyList;

public class Function {
    public static MyList mergeLists(MyList first, MyList second) {
        // создаем результирующий лист
        MyList result = new MyList();

        // проходимся по обоим массивам
        while (first.getSize() > 0 && second.getSize() > 0) {
            // если у первого элемент больше
            if (first.get(0) < second.get(0)) {
                // тогда записываем в результат элемент из первого списка и удаляем его
                result.add(first.getAndRemove(0));
            } else {
                // иначе записываем в результат элемент из второго списка и удаляем его
                result.add(second.getAndRemove(0));
            }
        }

        // проходим по оставшимся элементам из первого списка
        while (first.getSize() > 0) {
            // берем элемент из списка и удаляем его
            result.add(first.getAndRemove(0));
        }
        // проходим по оставшимся элементам из второго списка
        while (second.getSize() > 0) {
            // берем элемент из списка и удаляем его
            result.add(second.getAndRemove(0));
        }

        return result;
    }
}
