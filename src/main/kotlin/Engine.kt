import kotlin.math.pow

//Create sphere volume given radius
fun sphere(radius : Double) : Double{
    return ((4 * Math.PI) / 3) * cube(radius)
}

//Get radius of a sphere given its volume
fun radius(volume : Double) : Double{
    val radiusCube = (volume /  ((4 * Math.PI) / 3))
    return Math.cbrt(radiusCube)
}

//Create cube volume given its edge measure
fun cube(edge : Double) : Double{
    return edge * edge * edge
}

class Sphere{

    var volume : Double
    var radius : Double
    var diameter  : Double
    var area2d : Double
    var surface : Double
    var cubeEdge  : Double
    var edgeDiameterRatio  : Double
    var edgeRadiusRatio  : Double

    constructor(vol : Double, name : String = "Sphere"){
        volume = vol
        radius = radius(vol)
        diameter = radius * 2
        area2d = Math.PI * radius.pow(2.0)
        surface = (4 * Math.PI) * (radius.pow(2.0))
        cubeEdge = Math.cbrt(vol)
        edgeDiameterRatio = diameter / cubeEdge
        edgeRadiusRatio = cubeEdge / radius 
    }

    constructor(cube : Cube, name : String = "Sphere"){
        volume = cube.volume
        radius = cube.sphereRadius
        diameter = cube.sphereDiameter
        area2d = Math.PI * radius.pow(2.0)
        surface = (4 * Math.PI) * (radius.pow(2.0))
        cubeEdge = cube.edge
        edgeDiameterRatio = cube.edgeDiameterRatio
        edgeRadiusRatio = cube.edgeRadiusRatio
    }

    fun display(){
        println("Type: SPHERE")
        println("Volume: $volume")
        println("Radius: $radius")
        println("Diameter: $diameter")
        println("2D View Area: $area2d")
        println("Surface: $surface")
        println()
    }
}

class Cube{

    var type : String
    var volume : Double
    var edge  : Double
    var singleFaceArea : Double
    var surface : Double
    var sphereRadius : Double
    var sphereDiameter  : Double
    var edgeDiameterRatio  : Double
    var edgeRadiusRatio  : Double

    constructor(vol : Double, name : String = "Cube"){
        type = name
        volume = vol
        sphereRadius = radius(vol)
        sphereDiameter = sphereRadius * 2
        edge = Math.cbrt(vol)
        singleFaceArea = edge * edge
        surface = (singleFaceArea) * 6
        edgeDiameterRatio = sphereDiameter / edge
        edgeRadiusRatio = edge / sphereRadius 
    }

    constructor(sphere : Sphere, name : String = "Cube"){
        type = name
        volume = sphere.volume
        sphereRadius = radius(sphere.volume)
        sphereDiameter = sphereRadius * 2
        edge = Math.cbrt(sphere.volume)
        singleFaceArea = edge * edge
        surface = (singleFaceArea) * 6
        edgeDiameterRatio = sphereDiameter / edge
        edgeRadiusRatio = edge / sphereRadius 
    }

    fun display(){
        println("Type: CUBE")
        println("Volume: $volume")
        println("Edge: $edge")
        println("2D View Area: $singleFaceArea")
        println("Surface: $surface")
        println()
    }
}

class Binomial(valueA : Double, valueB : Double){
    var a = valueA
    var b = valueB

    var aCube : Double
    var aSquare : Double

    var bCube : Double
    var bSquare : Double

    var aSquareb : Double
    var bSquarea : Double
    
    var volume : Double

    init{
        aCube = a * a * a
        bCube = b * b * b

        aSquare = a * a 
        bSquare = b * b

        aSquareb = aSquare * b
        bSquarea = bSquare * a

        volume = aCube + (3 * aSquareb) + (3 * bSquarea) + bCube
    }

    fun display(){
        println("a: $a / b: $b")
        println("a3: $aCube")
        println("3a2b: ${3 * aSquareb}")
        println("3ab2: ${3 * bSquarea}")
        println("b3: $bCube")
        println("Volume: $volume")
        println("")
    }
}