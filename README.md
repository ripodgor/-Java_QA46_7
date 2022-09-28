# Задание 1. Статистика

Статистика - очень важный компонент любого бизнеса. У вас есть набор данных о продажах конкретного предприятия по месяцам: `[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]`.

Вам поручили написать небольшой сервис (программисты все заняты), который умеет по предоставленному ему массиву месячных продаж рассчитывать:
1. Сумму всех продаж
2. Среднюю сумму продаж в месяц
3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
5. Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
6. Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

Примечание:* в вашем задании нужно найти последний месяц, соответствующий условиям.

Сервис должен представлять с собой один класс с шестью методами - по методу на пункт; входные данные для рассчёта сервис должен принимать в параметрах своих методов. Обратите внимание, что написанный класс должен уметь работать с любыми значениями в массиве продаж, а приведённый выше набор это лишь пример данных для ваших тестов на методы создаваемого класса.

Метод ниже считает номер месяца минимальных продаж. Логика его такова: заводим переменную `minMonth` для хранения номера ячейки в массиве того месяца, в котором были минимальные продажи среди всех уже просмотренных; изначально мы никакие ещё не просмотрели, потому запишем туда номер 0. Будем циклом поочерёдно смотреть месяцы продаж: на каждой итерации у нас в `sale` будет количество продаж в рассматриваемом месяце, в `month` - номер этого рассматриваемого месяца. Если мы смотрим на месяц в котором продажи меньше чем в минимальном из просмотренных ранее (чей номер запомнен в `minMonth`), то считаем теперь этот рассматриваемый месяц минимальным (присваиваем в `minMonth` значение `month`). И так до конца массива продаж, тогда после цикла в `minMonth` у нас будет лежать номер месяца минимальных продаж. Останется только один момент: мы нумеровали месяцы с нуля (тк в массивах ячейки нумеруются с нуля), потому отдавая ответ нам надо прибавить 1.

```java
public int minSales(long[] sales) {
  int minMonth = 0;
  int month = 0; // переменная для индекса рассматриваемого месяца в массиве
  for (long sale : sales) {
    // sales[minMonth] - продажи в месяце minMonth
    // sale - продажи в рассматриваемом месяце
    if (sale <= sales[minMonth]) {
      minMonth = month;
    }
    month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
  }
  return minMonth + 1;
}
```

Вам необходимо:
1. Создать Maven проект, в котором в package `ru.netology.stats` будет класс `StatsService` с необходимыми методами (сами придумайте им говорящие названия)
1. Написать на каждый метод по одному автотесту, который проверяет правильность работы на тестовых данных
1. Убедитесь, что ваши автотесты работают и проходят (для этого пробуйте "ронять" каждый свой тест и удостоверяйтесь, что он действительно падает).

[Решение](https://github.com/ripodgor/-Java_QA46_7/blob/b3055e47434478d79c15ea1f86ceac69f5d665d5/src/test/java/ru/netology/StatsServiceTest.java)
