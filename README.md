# SpEL-Demo

The Spring Expression Language (“SpEL” for short) is a powerful expression language that supports querying and manipulating an object graph at runtime. It is a single well supported within the Spring community, but it is self-contained and can be used independently. SpEL supports calling methods, accessing properties, and calling constructors.

The SpEL classes and interfaces are located in the org.springframework.expression package

````
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-expression</artifactId>
            <version>5.3.1</version>
        </dependency>
````

You can use SpEL expressions with XML-based or annotation-based configuration metadata for defining BeanDefinition instances. In both cases, the syntax to define the expression is of the form `#{ <expression string> }`, and meanwhile SpEL provides relational, equality, and logical operations. 

````
@Value("#{environment['app.profile']=='prod'}")
    private Boolean isProduction;
````

> All of the textual operators are case-insensitive.

> lt (<)

> gt (>)

> le (<=)

> ge (>=)

> eq (==)

> ne (!=)

> div (/)

> mod (%)

> not (!).

> Logical Operators
> SpEL supports the following logical operators:

> and (&&)

> or (||)

> not (!)

