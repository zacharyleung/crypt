Crypt
=====

# About

A program that implements classical cryptography algorithms.
The real purpose of this program is as a simple example to illustrate how to make computer code available for anyone to download and use.

# Installation

In order to use Crypt, one first needs to install a Java Platform
Standard Edition Development Kit version 7.
The JDK can be downloaded from Oracle at the following
[link](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html).

Before the Java virtual machine can run the Java program,
the program's Java source code (`.java` files)
must be compiled into byte code (`.class` files)
using the `javac` compiler.
If your computer operating system is Mac or Linux,
then open a terminal;
if your computer operation system is Windows,
then open a command prompt.
Run the following commands to compile the Java source code

    javac Cipher.java
    javac NothingCipher.java
    javac CaesarCipher.java
    javac Crypt.java

To run the program, type in the command line:

    java Crypt <cipher> <input file>

**Example:**

    $ java Crypt NothingCipher flee.txt
    flee at once.
    we are discovered!
    $ java Crypt CaesarCipher flee.txt
    iohh dw rqfh.
    zh duh glvfryhuhg!

# Writing a new cipher

Currently, the only implemented ciphers are the nothing cipher 
and the [Caesar cipher](http://en.wikipedia.org/wiki/Caesar_cipher).
To implement a new cipher, for example a Pig Latin cipher,
write a new source file, for example `PigLatinCipher.java`.
The new class must extend the `Cipher.java` class,
and override the `encrypt()` method.
Then compile the Java source code, e.g.

    javac PigLatinCipher.java

Finally, to use the cipher to encrypt a plaintext,
run in a terminal

    java Crypt PigLatinCipher <input file>

