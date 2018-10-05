
# hibernate-batch-size
The main goal of this project is to provide simple solution to 
N+1 query problem.

# preface
A naive `O/R` implementation would `SELECT` entity and then do 
additional SELECTs for getting the information of child entities,
so in case of (ex. `@OnToMany`) mapped collection of child entities 
(`size = N`) causes **N+1 query problem**.

# solution
Without `@BatchSize`, you’d run into a N+1 query issue, so, instead of 2 SQL 
statements, there would be 10 queries needed for fetching the Employee 
child entities.

However, although `@BatchSize` is better than running into an `N+1` query 
issue, most of the time, a `DTO` projection or a `JOIN FETCH` is a much 
better alternative since it allows you to fetch all the required data 
with a single query.