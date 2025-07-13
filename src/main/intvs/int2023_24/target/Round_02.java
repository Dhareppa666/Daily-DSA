package main.intvs.int2023_24.target;

public class Round_02 {
    // HLD of Uber
    //

//    1. Functional Req:
//        -> User should be able to book can.
//        -> Drivers should be able to accept rides.
//
//    2. Non-Functional Req:
//        -> Highly Available
//        -> Low Latency

//    Entities:
//    User(id, finame, lname, contact_no, email)
//    Driver(id, finame, lname, contact_no, email, car/cab details)
//    Location(latt, lang)
//    Trip(id, status, user_id, driver_id, MetaData {srcLoc, dstLoc, startTime, EndTime})

//    UserManagementService(list<users>, add_user(), remove_user())
//    DriverManagmentService()

//    Endpoints:
//    GET: /api/book
//    Pass location data into headers
//    ResponseEntity<Driver>
//
//    POST: /api/rating
//    Trip id, ratings(1-5)
}
