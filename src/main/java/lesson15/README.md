1. Обновить ветку develop из main/master чтобы работать с корректными данными;

2. Создать ветку от develop с инициализацией для работы начинающих специалистов: 
JEED-32_init_structure_account_feature. 
Добавить SQL для создания БД (account & subsId - подписки). 
Реализовать структуру папок + AccountService & SubsService;

3. От созданной выше ветки создать еще две параллельных ветки для начинающих разработчиков:
JEED-33_init_CRUD_account_query;
JEED-34_init_CRUD_subs_query;

4. В первой ветке реализовать только CRUD запросы используя JDBC;

5. Во второй ветке реализовать CRUD запросы используя также JDBC 
+ отдельный запрос для Account, который вернет все аккаунты без подписки;

6. Слить все в ветку Develop, проверить работоспособность ветки Develop;

7. Создать новую ветку от Develop JEED-35_init_flow. 
Создать отдельный класс DataService, который будет отвечать за 
функционал ввода данных с клавиатуры(Используя сканер и возвращать результат);

8. В Main реализовать коммуникацию ввода данных и сохранения этих данных в БД.
