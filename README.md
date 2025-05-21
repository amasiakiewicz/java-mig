Project depicting what's new on every new Java, starting from Java 9. Every new version is available every 6 months with LTS versions for long term support 
every 2-3 years. 

\
Java 9:
- project Jigsaw -  we specify the modules and the dependencies between them (for low memory) and select only the non-essential ones, exports, requires, ...
- new http client -> HttpClient and HttpRequest instead of HttpURLConnection
- new process api -> ProcessHandle - meta info about jvm (arguments, command line, start time, cpu time)
- final or effectively final autoclosable in try-with-resources, not just new, declaration can be earlier 
- private methods in interfaces (static since JDK 8) - for default methods
- jshell - for testing snippets (something like scratch in IntelliJ)
- VarHandle and MethodHandle instead of Unsafe (reflection on steroids)
- several helper methods for set and stream (of, optional, etc.)
- jcmd -> additional app showing class hierarchy in runtime, setting JVM flags on the fly
- flow api -> similar to rxjava publisher-subscriber

\
Java 10:
- (demo) var for local variables - can be used when the type is known on the right (constructor, defined value), otherwise it obscures the picture
- language changes in collections, e.g., copyOf (returns a immutable copy), collector.toUnmodified..., language changes in Optionals -> orElseThrow
- Docker flags (on Linux) for CPU and memory -XX:-UseContainerSupport, -XX:ActiveProcessorCount=count, -XX:InitialRAMPercentage, -XX:MaxRAMPercentage, -XX:MinRAMPercentage
- TLS works by default in OpenJDK (cacerts keystore now has certificates and is open source)

\
Java 11 (LTS):
- new methods in String - search there may be the first choice before searching in StringUtils
- new methods in Files (for writing and reading strings) -> writeString and readString
- (demo) Predicate.not - e.g., in filter, also works for method reference
- var in lambda, to e.g., add annotations to types
- in-memory compilation (java HelloWorld.java instead of javac and then java)
- Java Flight Recorder is now free (diagnostics and profiling) and then in mission control (cool except for sampling -> better asyn-profiler, jprofiler)
- nestmates -> Class.isNestmateOf - parent class of nested, nest host

\
Java 12:
- new methods in strings
- Files.mismatch - compares files and returns the position of the first difference
- (demo) Collector.teeing -> merge 2 other collectors
- (demo) CompactNumberFormat - formatting numbers according to locale
- preview:
  - (demo) switch expressions -> no break, with arrow, multiple choices. I usually do not recommend, if-ology often indicates poor code design (lack of object orientation, polymorphism)
  - (demo) pattern matching in instanceOf -> if (obj instanceof String s), I also do not recommend - again indicates poor design

\
Java 13:
- preview:
  - (demo) yield in switch expressions -> return value
  - (demo) text blocks -> super cool, """, no escaping of ", multi-line

\
Java 14:
- switch expressions are now normally available, not as a preview
- escapes for text blocks \ (do not insert a new line) and \s (space)
- (demo) records - public record User(int id, String password) { }, automatic addition of constructors, getters, equals, hashCode, and toString - value objects, have some drawbacks, it's better to use Lombok

\
Java 15:
- records -> override constructor, no brackets - public User {}
- text blocks production ready
- preview:
  - (demo) sealed classes/interfaces - we indicate which classes/interfaces can inherit or implement them, such an additional visibility modifier. Sealed class permits only explicit subtypes, which have to be seales, non-sealed or final. -> quite useful overall

\
Java 16:
- You can invoke default methods using JDK dynamic proxy (Proxy.newProxyInstance...) with InvocationHandler.invokeDefault -> rarely needed  
- Stream.toList  
- Operations on vectors (IntVector.fromArray) - faster operations (incubating - so the API may change in future versions)  
- Pattern matching production ready  
- Local records, interfaces, and enums in methods, but without access to method variables -> I wouldn't recommend it, it may reduce readability

\
Java 17 (LTS):
- (demo) random number generator stream ready, RandomGeneratorFactory -> for pseudo random numbers
- sealed classes production ready
- preview:
  - (demo) pattern matching for switch -> switch (obj) { case Human h -> "";..., it's better to use some visitor pattern or map, though as a last resort it's okay

\
Java 18: minor changes

\
Java 19:
- virtual threads (preview) -> lightweight threads managed by JVM rather than VM
- structured concurrency (preview) -> sub-tasks can communicate with each other via StructuredTaskScope
- record patterns (preview) -> records in instanceof with internals 'o instanceof Location (var name, GPSPoint(var latitude, var longitude))' and in switch expression. In switch we can add 'when' keyword to narrow condition

\
Java 20:
- scoped values (incubating) -> immutable data bounded to thread and its children, scoped only within certain run method
- scoped values are shared via StructuredTaskScope

\
Java 21:
- virtual threads in prod
- record patterns in prod
- pattern matching in prod -> added 'null' case
- string template processors -> STR."Welcome to \{name}"; we have STR, FMT and RAW processors
- SequencedCollection, SequencedSet, SequencedMap -> interfaces for ordered collections
- new Key Encapsulation Mechanism API 
