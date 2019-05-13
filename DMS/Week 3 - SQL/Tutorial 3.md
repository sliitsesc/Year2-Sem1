# Tutorial 3

Consider the following relations in a movie database. 

- Movie (title:char(25), year:int, length:float, language:char(15), type:char(1), directorName: char(30)) 
- MovieStar (name: char (15), country:varchar(40), gender:char(1), birthdate: date) 
- StarsIn (movieTitle:char(25), movieYear:int, starname:char(15), role:varchar(15)) 
- Theater (theaterName:  char (20), country: varchar (40), city: varchar (20), capacity:int)
- Show (movieTitle: char (25), theaterName:char (20), datetime: datetime, ticketPrice: real, spectators:int)

The attributes of the Movie relation are title of the movie, year it was made, language,filmtype which may be ‘F’ or ‘D’ for feature or documentary respectivelyand  the  name  of  the  director  of  the  movie.  The MovieStar  relation  has  attributes  to  record  the  name,  country, gender (‘M’ or ‘F’), and birthday of stars. StarsIn relation associates the movie with stars that acted in them and contains the role (‘lead’, ‘support’, or ‘other’) they played. The Theater relation has attributesto store the name, country, city and the capacity of theaters. Show relation stores information movies shown in theaters. It stores the title of the movie shown, theater where the movie is shown, price of the ticket to see the movie and the number of specters who are there to see the movie. The primary keys of all relations are underlined.

Write SQL statements to answer the following queries.

1. Find the names of the directors who had worked with Americanstars. 
Assume that if an actor/actressstars in a moviethe directed by a director the actor/actress works with that director.
2. Find the movies in English for which all seats are booked in a theater. 
3. Display the names of stars who have acted in 3or more movies in any year between 2017and 2018. 
4. Find the namesof male starswho had only starred in leadroles in 2018. 
5. Find the names of the starswho has appeared in same movie with ‘Robert Downey’.
6. Find the names of feature movies which is viewed by at least 1 Million spectatorsin total. 
7. Find the total income ofeach movie shown in theaters in America.
8. Find the name of the theaters located in ‘New York’ which shows both ‘The Passenger’ and ‘Jurassic World’ on 1st January-2018.
9. Find the feature moviesfor which all shows have more than 200 spectators.
10. Find  the  name  of  the  most  popular  movie.  The  most  popular  movie  is  the  movie  viewed  by  most spectators.