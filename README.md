# This project deals with two types of flights: arrivals and departures.
Arrivals were created with the intent to land on the runway at this airport.
The Flight Logic Sub-system would then remove such flights from the radar screen,
after they landed. Departures, on the other hand, were flights
created on the runway, bound for some other airport as a destination.
The flights created as departures were to be under the control of the ATC 
until they exited the airspace.
 
All flights within the airspace were checked routinely for collisions. If two flights
approached within three miles of each other, and the two flights’ altitudes were within
100 feet, the ATC had to be warned that a collision could occur between those two
flights.
