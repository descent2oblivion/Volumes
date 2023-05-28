//case 1 convert cube to sphere
fun case1(){
    println("Case 1: Convert cube to sphere\r\n")

    var c1 = Cube(cube(10.0))
    c1.display()
    
    var s1 = Sphere(c1)
    s1.display()
}

//case 2 convert sphere to cube
fun case2(){
    println("Case 2: Convert sphere to cube\r\n")

    var s1 = Sphere(sphere(10.0))
    s1.display()
    
    var c1 = Cube(s1)
    c1.display()
}

//case 3 generate cubic binomial
fun case3(){
    println("Case 3: Generate cubic binomial\r\n")

    var b1 = Binomial(1.0, 2.0)
    b1.display()
}

//case 4 convert cubical binomial to cube and sphere
fun case4(){
    println("Case 4: Convert cubic binomial to cube and sphere\r\n")

    var b1 = Binomial(1.0, 2.0)
    b1.display()

    var c1 = Cube(b1.volume)
    c1.display()
    
    var s1 = Sphere(b1.volume)
    s1.display()
}

//case 5 Get sphere sizes of cubic binomial
fun case5(){
    println("Case 5: Get sphere sizes of cubic binomial\r\n")

    var b1 = Binomial(1.0,2.0)

    var s1 = Sphere(b1.aCube,"a cube")

    var s2 = Sphere(b1.aSquareb, "a square b")

    var s3 = Sphere(b1.bSquarea, "b square a")

    var s4 = Sphere(b1.bCube, "b cube")

    b1.display()
    println(s1.radius)
    println(s2.radius)
    println(s3.radius)
    println(s4.radius)
}