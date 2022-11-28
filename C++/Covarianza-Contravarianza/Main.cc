#include <iostream>
#include "C.h"
#include "Y.h"
using namespace std;

int main(int argc, char const *argv[])
{
    A a = A();
    B b = B();
    C c = C();

    a.foo(b);
    a.foo(c);

    b.foo(a);
    b.foo(c);

    c.foo(a);
    a.foo(b);
    return 0;
}
