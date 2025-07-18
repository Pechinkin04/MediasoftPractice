# Система Управления Автопарком

Полнофункциональная система управления автопарком на Java, демонстрирующая работу с массивами, коллекциями, Stream API, equals/hashCode и создание интерактивных приложений.

## Описание проекта

Проект представляет собой комплексное решение для управления автоцентром, включающее:
- Управление каталогом автомобилей
- Аналитику и статистику
- Интерактивное пользовательское меню
- Демонстрацию всех основных концепций Java

## Решаемые задачи

### 1. **Массивы** - Работа с парком машин
- Создание массива из 50 случайных годов выпуска (2000-2025)
- Фильтрация машин, выпущенных после 2015 года
- Расчет среднего возраста автомобилей

### 2. **Коллекции** - Управление моделями
- Работа со списком моделей автомобилей с дубликатами
- Удаление дубликатов и сортировка в обратном алфавитном порядке
- Замена моделей Tesla на "ELECTRO_CAR"
- Сохранение результатов в Set

### 3. **equals/hashCode** - Сравнение автомобилей
- Переопределение equals/hashCode для сравнения только по VIN
- Защита от добавления дубликатов в HashSet
- Реализация Comparable для сортировки по году выпуска

### 4. **Stream API** - Анализ автопарка
- Фильтрация машин с пробегом менее 50,000 км
- Сортировка по цене (убывание)
- Топ-3 самые дорогие машины
- Расчет среднего пробега
- Группировка по производителям

### 5. **Практическое задание** - Автоцентр
- Полнофункциональный класс CarDealership
- Все методы управления автопарком
- Статистика и аналитика
- Интерактивное меню

## Структура проекта

```
src/main/java/org/example/
├── Main.java           # Главный класс с демонстрацией и меню
├── Car.java            # Модель автомобиля
├── CarType.java        # Enum типов автомобилей
└── CarDealership.java  # Класс управления автоцентром
```

## Технологии

- **Java 21** - Основной язык программирования
- **Gradle** - Система сборки проекта
- **Stream API** - Функциональное программирование
- **Collections Framework** - Работа с коллекциями
- **Scanner** - Пользовательский ввод

## Запуск проекта

### Предварительные требования
- Java 17 или выше
- Gradle (входит в комплект)

### Команды запуска

```bash
# Клонирование и переход в директорию
cd Task2

# Сборка проекта
./gradlew build

# Запуск приложения
./gradlew run

# Альтернативный способ через JAR
./gradlew jar
java -jar build/libs/Task2-1.0-SNAPSHOT.jar
```

## Использование

### Автоматическая демонстрация
При запуске программа автоматически:
1. Инициализирует тестовые данные (8 автомобилей)
2. Демонстрирует решение всех 4 основных задач
3. Показывает результаты работы с массивами, коллекциями, equals/hashCode и Stream API

### Интерактивное меню
После демонстрации доступно интерактивное меню:

```
1. Добавить машину
2. Найти машины по производителю
3. Средняя цена машин по типу
4. Показать машины по годам (от новых к старым)
5. Статистика по типам
6. Самая старая и новая машина
7. Показать все машины
8. Stream API операции
0. Выход
```

## Примеры работы

### Добавление автомобиля
```java
Car newCar = new Car("VIN123", "Camry", "Toyota", 2023, 15000, 2800000, CarType.SEDAN);
dealership.addCar(newCar);
```

### Поиск по производителю
```java
List<Car> toyotaCars = dealership.findCarsByManufacturer("Toyota");
```

### Stream API операции
```java
// Топ-3 дорогие машины
List<Car> expensive = dealership.getTop3MostExpensive();

// Группировка по производителю
Map<String, List<Car>> grouped = dealership.groupCarsByManufacturer();
```

## Архитектурные особенности

### Класс Car
- **Поля**: VIN, модель, производитель, год, пробег, цена, тип
- **equals/hashCode**: Сравнение только по VIN коду
- **Comparable**: Сортировка по году выпуска (новые → старые)

### Класс CarDealership
- **Хранение**: HashSet для предотвращения дубликатов
- **Безопасность**: Проверка VIN при добавлении
- **Аналитика**: Методы для статистики и группировки

### Enum CarType
```java
SEDAN, SUV, ELECTRIC, HATCHBACK, COUPE, WAGON
```

## Функциональность

### Основные операции
- Добавление автомобилей с проверкой дубликатов
- Поиск по различным критериям
- Статистический анализ
- Сортировка и группировка
- Расчет средних цен и пробегов

### Stream API операции
- Фильтрация по пробегу, цене, типу
- Сортировка по различным критериям
- Группировка по производителям
- Статистические расчеты

## Тестовые данные

Программа автоматически создает тестовый автопарк:
- 8 различных автомобилей
- Разные производители: Toyota, BMW, Tesla, Honda, Audi, Mazda
- Различные типы: SEDAN, SUV, ELECTRIC
- Годы выпуска: 2018-2023
- Различные пробеги и цены

## Обработка ошибок

- Валидация пользовательского ввода
- Обработка некорректных данных
- Информативные сообщения об ошибках
- Защита от добавления дубликатов

## Логи и вывод

Программа предоставляет подробную информацию о:
- Процессе добавления автомобилей
- Результатах поисковых запросов
- Статистических расчетах
- Ошибках и предупреждениях
