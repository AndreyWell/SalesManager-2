<img src="https://netology.ru/dist/public/images/logo-color-text_89097e.svg" width="200">

# Внедрение системы контроля версий

## Класс SalesManager

**SalesManager** - анализирует статистику продаж.


## Класс Main 

*Реализует работу класса **SalesManager***

**Порядок работы:**
* массив **sales** содержит статистику продаж
* создается объект класса **SalesManager**
* через созданный объект **salesManager** вызывается метод **max()**
* через переменную  **result** в консоль выводится результат метода
```java
int[] sales = {300, 400, 500, 200};

SalesManager salesManager = new SalesManager(sales);

int result = salesManager.max();
System.out.println(result);
```

[Ссылка на репозиторий](https://github.com/AndreyWell/SalesManager.git)
