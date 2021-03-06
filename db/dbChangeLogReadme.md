На каждое изменение в базе данных необходимо добавлять в файл dbChangeLog.xml блок \<changeSet>.

В блоке changeSet указываются параметры author и id. Id должен быть уникальным.
В блоке changeSet содержатся блоки sql и rollback. 
Блок sql содержит запросы в формате SQL для внесения изменений в БД. 
Блок rollback содержит запросы, которые полностью отменяют изменения блока sql, для последующего возможного отката структуры БД.

Доступен пример в файле dbChangeLog.example.xml

Необходимо договориться в команде, каким образом назначать id каждому последующему блоку changeSet.
Возможно указывать дату и время заполнения файла.
В случае конфликтов при слиянии веток в гите с разных пул реквестов, необходимо сохранять все блоки changeSet.

Старые блоки changeSet не удаляются, в последующем их можно выносить в отдельные файлы, но dbChangeLog.xml все равно должен иметь на них ссылку.

Документация https://www.liquibase.org/documentation/index.html