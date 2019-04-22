# Epoch Converter!

A time utility class that allows the developer to quickly retrieve times from epoch values and format values. The utilities include getter's, setter's, and mutators. Getter's allow the developer to get values from various methods. Setter's allow the developer to set default information and parameters. Mutator's allow changing formats, converting from time stamp to epoch and so-forth.


# Files

The project folder will need to be opened in an IDE such as Eclipse or Netbeans. [Follow their documentation / instructions to import a project folder.] In the project folder under **[ src ]** , you will find the **[ com.epochConverter ]** package. Click on this folder and open the **[ timeClock ]** file. Click build and run. [Follow IDE documentation]

> **Note:** The ** Project ** is built to be an add-on class as a utility. The timeClock file is simply to allow testing.

# Classes
There are three main classes as of version 1.0.0. 
## epochConverter()
This is the main class. Everything you ask for or set will first touch this class file. You can call this by simply doing: `private  static epochConverter epoch =  new epochConverter();`
before any methods in your class files. Or you can alternatively call it by doing: 
`epochConverter epoch =  new epochConverter();`
within your method. 

 ## epochConverter.get()
Within the get class, you have multiple options to 'get' date and time information from the epoch timestamp.

**date(time)** 
[time (int; the epoch timestamp we are getting the date from.)]

    epochConverter.get.date(<epoch-time>) // Returns 	(month day(nd,th,st), year)
**timeDiff(time, ?other)** 
[time (int; the epoch timestamp we are getting the date from.) other (int; the optional value to compare against.)]

	 epochConverter.get.timeDiff(<epoch-time>, optional <epoch-time>) // Returns (x min, x hr, etc..)

**dateFromTime(time)** 
[time (int; the epoch timestamp we are getting the date from.)]

	epochConverter.get.dateFromTime(<epoch-time>) // Returns mm/dd/yyyy formatted time.

**totalTime(time)** 
[time (int; the epoch timestamp we are getting the date from.)]

	epochConverter.get.totalTime(<epoch-time>) // Returns years: x months: x weeks: x etc...


## epochConverter.set()
**time(time)**
[time (int; epoch timestamp to set class to use.)]

	epochConverter.set.time(<epoch-time>) // No Return Data
**format(string)**
[string (string; Formatting Such As mm/dd/yyyy)]

	epochConverter.set.format("mm/dd/yyyy") // No Return Data
**date(string)**
[string (int; date in mm/dd/yyyy format.)]

	epochConverter.set.date("04/22/2019"); // No Return Data
## epochConverter.mutator()
> **Note:** Feature coming later. Allows for manipulation of strings and date objects.



# Credits
> **Note:** Classes only use native Java methods and code. Nothing has been borrowed or implemented.
