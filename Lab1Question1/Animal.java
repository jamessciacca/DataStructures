package Lab1Question1;
abstract class Animal {
}

abstract class Bird extends Animal {
}

abstract class Reptile extends Animal {
}

interface ColdBlooded {
}

interface OceanDwelling {
}

class Dove extends Bird {
}

class Eagle extends Bird {
}

class Hawk extends Bird {
}

class Penguin extends Bird implements ColdBlooded, OceanDwelling {
}

class Seagull extends Bird implements OceanDwelling {
}

class Rattlesnake extends Reptile implements ColdBlooded {
}

class Turtle extends Reptile implements ColdBlooded, OceanDwelling {
}

