package com.tobiloba.mydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
        final String[] chapterArray = {
                "Chapter 1",
                "Chapter 2",
                "Chapter 3",
                "Chapter 4",
                "Chapter 5",
                "Chapter 6",
                "Chapter 7",
                "Chapter 8",
                "Chapter 9",
                "Chapter 10",
                "Chapter 11"
        };
        final String[] topicArray = {
                "Getting Started",
                "HTML",
                "Anchors and Hyperlinks",
                "Classes and IDs",
                "Comments",
                "Div Element",
                "Forms",
                "Linking Resource",
                "List",
                "Navigation bar",
                "Image resource"
        };
        final String[] aboutArray = {
                "Integrated development environment",
                "Introduction to html",
                "Characteristics of links",
                "Component identification",
                "Html comment block",
                "Block component",
                "Characteristics of forms",
                "Attributes of resource",
                "Difining items",
                "Nvigation components",
                "Embedding images"
        };


        final String[] contentArray = {
                "Smiles,you are welcome to the web development tutorial series\n" +
                        "Web development is a software that accept all devices access,unlike mobile apps that works only on mobile device and desktop applications which works only on desktop\n" +
                        "Web development has been a market place for all technology,in the sense that all technology invention has their informations and content on a universal accessible software which is a website \n" +
                        "This universal accessible software(Website) has a very large demand in tech market place because all businessess and enterprises will advertise for the world to experience their product or services\n" +
                        "This tutorial series ends at 5.0,this series will be teaching you the tech used in building a site\n" +
                        "This version 1.0 comprises on creating the content  of a page,i.e writing words to the world to see via internet,this word are referenced as UTF-8(Universal text format) and the tech used in building content is the HTML(Hyper text mark up language)\n" +
                        "Further tutorials will be based on how to design and style a web page,making a web page responsive with a user,lastly how the user interact with the site through a server,using a database management system.\n" +
                        "There are several IDEs for writing codes as a beginner in programming,most especially for web development\n" +
                        "The major IDEs for web development are\n" +
                        " Visual studio code\n" +
                        " Sublime text\n" +
                        " Notepad++\n" +
                        " Atom\n" +
                        " Etc\n" +
                        " You can choose any of the IDEs to start with,but the best is visual studio.\n" +
                        "Download your IDE and get started to writ your codes,i remembered when i started my career as a web developer, i started with notepad++\n" +
                        "Once your integrated development environment is ready, create a folder and start practicing with the following tutorial\n" +
                        "For more information on starting the IDE and file creation,please send an Email to Owoeye1321@gmail.com \n" +
                        "Good luck",
                "HTML \n \b(Hypertext Markup Language) is an XML-compliant system of annotating documents with " +
                        "'tags'. It is used specifically to create content for web pages and web applications, which can then " +
                        "be shared over a network.\nIntroduction\n\n" +
                        "HTML (Hypertext Markup Language) uses a markup system composed of elements which" +
                        "represent specific content. Markup means that with HTML you declare what is presented to a " +
                        "viewer, not how it is presented. Visual representations are defined by Cascading Style Sheet" +
                        " (CSS) and realized by browsers. Still existing elements that allow for such, like e.g. font, \"are" +
                        " entirely obsolete, and must not be used by authors\"[1]\n" +
                        " HTML is sometimes called a programming language but it has no logic, so is a markup language.\n" +
                        " HTML tags provide semantic meaning and machine-readability to the content in the page.\n" +
                        "An element usually consists of an opening tag (<element_name>), a closing tag (</element_name>)," +
                        " which contain the element's name surrounded by angle brackets, and the content in between:" +
                        " <element_name>...content...</element_name>\n" +
                        " There are some HTML elements that don't have a closing tag or any contents. These are called" +
                        " void elements. Void elements include <img>, <meta>, <link> and <input>.\n" +
                        " Element names can be thought of as descriptive keywords for the content they contain, such as" +
                        " video, audio, table, footer.\n" +
                        "A HTML page may consist of potentially hundreds of elements which are then read by a web" +
                        " browser, interpreted and rendered into human readable or audible content on the screen." +
                        " For this document it is important to note the difference between elements and tags:\n" +
                        "Elements: video, audio, table, footer\n" +
                        "Tags: <video>, <audio>, <table>, <footer>, </html>, </body>\nElement insight" +
                        "Let's break down a tag...\n" +
                        "The <p> tag represents a common paragraph.\n" +
                        "Elements commonly have an opening tag and a closing tag. The opening tag contains the" +
                        " element's name in angle brackets (<p>). The closing tag is identical to the opening tag with the" +
                        " addition of a forward slash (/) between the opening bracket and the element's name (</p>).\n" +
                        "Content can then go between these two tags: <p>This is a simple paragraph.</p>.\nCreating a simple page\n" +
                        "The following HTML example creates a simple \"Hello World\" web page.\n" +
                        "HTML files can be created using any text editor. The files must be saved with a .html or .htm[2]" +
                        " extension in order to be recognized as HTML files.\n" +
                        "Once created, this file can be opened in any web browser.\n"+
                        "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        " <head>\n" +
                        " <meta charset=\"UTF-8\">\n" +
                        " <title>Hello!</title>\n" +
                        " </head>\n" +
                        " <body>\n" +
                        " <h1>Hello World!</h1>\n" +
                        " <p>This is a simple paragraph.</p>\n" +
                        " </body>\n" +
                        "</html>\n"+
                        "Simple page break down\n" +
                        "These are the tags used in the example:\n"+
                        "Tag Meaning"+
                "<!DOCTYPE>\n"+
                "Defines the HTML version used in the document. In this case it is HTML5.\n"+

"<html>\n"+     "Opens the page. No markup should come after the closing tag (</html>). The "+
        "lang attribute declares the primary language of the page using the ISO language"+
        "codes (en for English).\n"+

"<head>\n"+
               "Opens the head section, which does not appear in the main browser window but "+
        "mainly contains information about the HTML document, called metadata. It can "+
        "also contain imports from external stylesheets and scripts. The closing tag is "+
"</head>.\n"+
"<meta>\n"+
               "Gives the browser some metadata about the document. The charset attribute "+
        "declares the character encoding. Modern HTML documents should always use "+
        "UTF-8, even though it is not a requirement. In HTML, the <meta> tag does not "+
        "require a closing tag.\n"+

"<title>\n"+
                "The title of the page. Text written between this opening and the closing tag ( "+
                "</title>) will be displayed on the tab of the page or in the title bar of the browser.\n"+
               "<body>\n"+
                "Opens the part of the document displayed to users, i.e. all the visible or audible "+
        "content of a page. No content should be added after the closing tag </body>.\n"+
"<h1>\n"+ "A level 1 heading for the page.\n"+
                        "<p> Represents a common paragraph of text.",
                "Anchors and Hyperlinks\n\b" +
                "Introduction to hyperlinks\n\b" +
                "Anchor tags are commonly used to link separate webpages, but they can also be used to link " +
                "between different places in a single document, often within table of contents or even launch " +
                "external applications. This topic explains the implementation and application of HTML anchor tags " +
                "in various roles.\n"+
                "<href>\n"+
                "Specifies the destination address. It can be an absolute or relative URL, or the "+
                "name of an anchor. An absolute URL is the complete URL of a website like "+
                "http://example.com/. A relative URL points to another directory and/or document "+
                "inside the same website, e.g. /about-us/ points to the directory “about-us” inside "+
                "the root directory (/). When pointing to another directory without explicitly "+
        "specifying the document, web servers typically return the document “index.html”"+
        "inside that directory.\n"+
                "Download"+
                        "Specifies that the target will be downloaded when a user clicks on the hyperlink."+
                "The value of the attribute will be the name of the downloaded file. There are no"+
                "restrictions on allowed values, and the browser will automatically detect the \n"+
                "Examples\n\b"+
                "Link to another site\n"+
                "This is the basic use of the <a> (anchor element) element:\n " +
                        "<a href=\\\"http://example.com/\\\">Link to example.com</a>\n" +
                        "It creates a hyperlink, to the URL http://example.com/ as specified by the href (hypertext " +
                        "reference) attribute, with the anchor text \"Link to example.com\". It would look something like the " +
                        "following:\n",
                "Classes and IDs\n\b" +
                        "Introduction to identification\n\b" +
                        "Classes and IDs make referencing HTML elements from scripts and stylesheets easier. The class " +
                        "attribute can be used on one or more tags and is used by CSS for styling. IDs however are " +
                        "intended to refer to a single element, meaning the same ID should never be used twice. IDs are " +
                        "generally used with JavaScript and internal document links, and are discouraged in CSS. This " +
                        "topic contains helpful explanations and examples regarding proper usage of class and ID " +
                        "attributes in HTML.\n" +
                        "Syntax\n" +
                        "• class=\"class1 class2 class3\"\n" +
                        "• id=\"uniqueid\"\nRemarks\n" +
                        "Both class and id are global attributes, and may therefore be assigned to any HTML\n" +
                        "element.\n" +
                        "•\n" +
                        "Class names must begin with a letter (A-Z or a-z) and can be followed by letters, digits ,\n" +
                        "hyphens and underscores.\n" +
                        "•\n" +
                        "In HTML5, the class and id attributes can be used on any element. In HTML 4.0.1, they were\n" +
                        "off-limits to the <base>, <head>, <html>, <meta>, <param>, <script>, <style> and <title> tags.\n" +
                        "•\n" +
                        "An element can have one or more classes. Classes are separated by spaces and cannot\n" +
                        "contain spaces themselves.\n" +
                        "•\n" +
                        "An element can have only one ID and it must be unique within its context (i.e. a webpage).\n" +
                        "IDs also cannot contain spaces themselves.\nGiving an element an ID\n" +
                        "The ID attribute of an element is an identifier which must be unique in the whole document. Its " +
                        "purpose is to uniquely identify the element when linking (using an anchor), scripting, or styling " +
                        "(with CSS).<div id=\"example-id\"></div>\n" +
                        "You should not have two elements with the same ID in the same document, even if the attributes " +
                        "are attached to two different kinds of elements. For example, the following code is incorrect:\n" +
                        "<div id=\"example-id\"></div>\n" +
                        "<span id=\"example-id\"></span>\n" +
                        "Acceptable Values\n" +
                        "For an ID\n" +
                        "The only restrictions on the value of an id are:\n" +
                        "1. it must be unique in the document\n" +
                        "2. it must not contain any space characters\n" +
                        "3. it must contain at least one character\n" +
                        "So the value can be all digits, just one digit, just punctuation characters, include special\n" +
                        "characters, whatever. Just no whitespace.\n",
                " Comments\n\b" +
                        "Introduction to comments\n\b" +
                        "Similar to other programming, markup, and markdown languages, comments in HTML provide " +
                        "other developers with development specific information without affecting the user interface. Unlike " +
                        "other languages however, HTML comments can be used to specify HTML elements for Internet " +
                        "Explorer only. This topic explains how to write HTML comments, and their functional applications.\n" +
                        "Syntax\n" +
                        "• <!-- Comment text -->\n" +
                        "Remarks\n" +
                        "Anything starting with <!-- and ending with --> is a comment. Comments cannot contain two " +
                        "adjacent dashes (--), and must end with exactly two dashes (i.e. ---> is not correct).\n" +
                        "Comments are not visible on a web page and cannot be styled with CSS. They can be used by the " +
                        "page's developer to make notes within the HTML, or to hide certain content during development.\n" +
                        "For dynamic or interactive pages, hiding and showing content is done with JavaScript and CSS " +
                        "rather than with HTML comments.\n" +
                        "JavaScript can be used to get the content of HTML comment nodes and these nodes can be " +
                        "dynamically created, added and removed from the document but this will not affect how the page " +
                        "is displayed.\n" +
                        "Since HTML comments are part of the page's source code, they are downloaded to the browser " +
                        "along with the rest of the page. The source code can typically be viewed using the web browser's " +
                        "menu option to \"View Source\" or \"View Page Source.\"\n" +
                        "Examples\n\b" +
                        "Creating comments\n" +
                        "HTML comments can be used to leave notes to yourself or other developers about a specific point\n" +
                        "in code. They can be initiated with <!-- and concluded with -->, like so:\n" +
                        "Examples\n\b" +
                        "Creating comments\n" +
                        "HTML comments can be used to leave notes to yourself or other developers about a specific point " +
                        "in code. They can be initiated with <!-- and concluded with -->, like so:\n" +
                        "<!-- I'm an HTML comment! -->\n" +
                        "They can be incorporated inline within other content\n" +
                        "<h1>This part will be displayed <!-- while this will not be displayed -->.</h1>\n" +
                        "They can also span multiple lines to provide more information:\n" +
                        "<!-- This is a multiline HTML comment.\n" +
                        " Whatever is in here will not be rendered by the browser.\n" +
                        " You can \"comment out\" entire sections of HTML code.\n" +
                        "-->\n" +
                        "However, they cannot appear within another HTML tag, like this:\n" +
                        "<h1 <!-- testAttribute=\"something\" -->>This will not work</h1>\n",
                " Div Element\n\b" +
                        "Introduction to division element\n\b" +
                        "The div element in HTML is a container element that encapsulates other elements and can be " +
                        "used to group and separate parts of a webpage. A div by itself does not inherently represent " +
                        "anything but is a powerful tool in web design. This topic covers the purpose and applications of the " +
                        "div element.\n" +
                        "Syntax\n" +
                        "• <div>example div</div>\n" +
                        "Examples\n\b" +
                        "Nesting\n" +
                        "It is a common practice to place multiple <div> inside another <div>. This is usually referred to as " +
                        "\"nesting\" elements and allows for further dividing elements into subsections or aid developers with " +
                        "CSS styling.\n" +
                        "The <div class=\"outer-div\"> is used to group together two <div class=\"inner-div\"> elements; each " +
                        "containing a <p> element.\n" +
                        "<div class=\"outer-div\">\n" +
                        " <div class=\"inner-div\">\n" +
                        " <p>This is a paragraph</p>\n" +
                        " </div>\n" +
                        " <div class=\"inner-div\">\n" +
                        " <p>This is another paragraph</p>\n" +
                        " </div>\n" +
                        "</div>\n" +
                        "Basic usage\n" +
                        "The <div> element usually has no specific semantic meaning by itself, simply representing a " +
                        "division, and is typically used for grouping and encapsulating other elements within an HTML " +
                        "document and separating those from other groups of content. As such, each <div> is best " +
                        "described by its contents.\n" +
                        "<div>\n" +
                        " <p>Hello! This is a paragraph.</p>\n" +
                        "</div>\n",
                " Forms\n\b" +
                        "Introduction to forms\n\b" +
                        "In order to group input elements and submit data, HTML uses a form element to encapsulate input " +
                        "and submission elements. These forms handle sending the data in the specified method to a page " +
                        "handled by a server or handler. This topic explains and demonstrates the usage of HTML forms in " +
                        "collecting and submitting input data.\n" +
                        "Syntax\n" +
                        "• <form method=\"post|get\" action=\"somePage.php\" target=\"_blank|_self|_parent|_top|framename\">\n" +
                        "Attributes of form include"+
                        "Action\n" +
                        "Specifies where to send the form-data when a form is submitted.\n" +
                        "Method\n" +
                        "Specifies the HTTP method to use when sending form-data (POST or" +
                        "GET).\n" +
                        "Name\n" +
                        "Specifies the name of a form.\n" +
                        "Target\n" +
                        "Specifies where to display the response that is received after\n" +
                        "submitting the form.\n" +
                        "Example of a form\n" +
                        "<form>\n" +
                        " <fieldset>\n" +
                        " <legend>1st field set:</legend>\n" +
                        " Field one:<br>\n" +
                        " <input type=\"text\"><br>\n" +
                        " Field two:<br>\n" +
                        " <input type=\"text\"><br>\n" +
                        " </fieldset><br>\n" +
                        " <fieldset>\n" +
                        " <legend>2nd field set:</legend>\n" +
                        " Field three:<br>\n" +
                        " <input type=\"text\"><br>\n" +
                        " Field four:<br>\n" +
                        " <input type=\"text\"><br>\n" +
                        " </fieldset><br>\n" +
                        " <input type=\"submit\" value=\"Submit\">\n" +
                        "</form>\n",
                " Linking Resources\n\b" +
                        "Introduction to resource\n\b" +
                        "While many scripts, icons, and stylesheets can be written straight into HTML markup, it is best " +
                        "practice and more efficient to include these resources in their own file and link them to your " +
                        "document. This topic covers linking external resources such as stylesheets and scripts into an " +
                        "HTML document.\n" +
                        "Syntax\n" +
                        "• <link rel=\"link-relation\" type=\"mime-type\" href=\"url\">\n" +
                        "• <script src=\"path-to-script\"></script>\n" +
                        "Attributes of resources\n" +
                        "Specifies the location of the linked document\n" +
                        "rel\n" +
                        "Required. Specifies the relationship between the current document and the\n" +
                        "linked document\n" +
                        "type\n" +
                        "Specifies the media type of the linked document",
                " Lists\n\b" +
                        "Introduction to list\n\b" +
                        "HTML offers three ways for specifying lists: ordered lists, unordered lists, and description lists.\n" +
                        "Ordered lists use ordinal sequences to indicate the order of list elements, unordered lists use a " +
                        "defined symbol such as a bullet to list elements in no designated order, and description lists use " +
                        "indents to list elements with their children. This topic explains the implementation and combination " +
                        "of these lists in HTML markup.\n" +
                        "Syntax\n" +
                        "• <ol> ordered list items </ol>\n" +
                        "• <ul> unordered list items </ul>\n" +
                        "• <li> list item (ordered and not) </li>\n" +
                        "• <dl> description list items </dl>\n" +
                        "• <dt> description list title </dt>\n" +
                        "• <dd> description list description </dd>\n" +
                        "Unordered list\n" +
                        "An unordered list can be created with the <ul> tag and each list item can be created with the <li>\n" +
                        "tag as shown by the example below:\n" +
                        "<ul>\n" +
                        " <li>Item</li>\n" +
                        " <li>Another Item</li>\n" +
                        " <li>Yet Another Item</li>\n" +
                        "</ul>\n" +
                        "This will produce a bulleted list (which is the default style):\n" +
                        "• Item\n" +
                        "• Another Item\n" +
                        "• Yet Another Item\n" +
                        "You should use ul to display a list of items, where the order of the items is not " +
                        "important. If changing the order of the items makes the list incorrect, you should use\n" +
                        "Ordered List\n" +
                        "An ordered list can be created with the <ol> tag and each list item can be created with the <li> tag" +
                        "as in the example below:\n" +
                        "<ol>\n" +
                        " <li>Item</li>\n" +
                        " <li>Another Item</li>\n" +
                        " <li>Yet Another Item</li>\n" +
                        "</ol>\n" +
                        "This will produce a numbered list (which is the default style):\n" +
                        "1. Item\n" +
                        "2. Another Item\n" +
                        "3. Yet Another Item\n",
                "Navigation Bars\n" +
                        "Examples\n" +
                        "Basic Navigation Bar\n" +
                        "Navigation bars are essentially a list of links, so the ul and li elements are used to encase " +
                        "navigation links.\n" +
                        "<ul>\n" +
                        " <li><a href=\"#\">Home</a></li>\n" +
                        " <li><a href=\"#\">About</a></li>\n" +
                        " <li><a href=\"#\">Contact</a></li>\n" +
                        "</ul>\n" +
                        "HTML5 Navigation Bar\n" +
                        "To make a navigation bar using the HTML5 nav element, encase the links within the nav tag.\n" +
                        "<nav>\n" +
                        " <a href=\"#\">Home</a>\n" +
                        " <a href=\"#\">About</a>\n" +
                        " <a href=\"#\">Contact</a>\n" +
                        "</nav>",
                " Images\n" +
                        "Syntax\n" +
                        "• <img src=\"\" alt=\"\">\n" +
                        "Src\n" +
                        "Specifies the URL of the image\n" +
                        "Size\n" +
                        "Image sizes between breakpoints\n" +
                        "Width\n" +
                        "Specifies the width of the image (optional)\n" +
                        "Height\n"+
                "Specifies the height of the image (optional)\n" +
                        "Examples\n" +
                        "Creating an image\n" +
                        "To add an image to a page, use the image tag.\n" +
                        "Image tags (img) do not have closing tags. The two main attributes you give to the img tag are src, " +
                        "the image source and alt, which is alternative text describing the image.\n" +
                        "<img src=\"images/hello.png\" alt=\"Hello World\">\n" +
                        "You can also get images from a web URL:\n" +
                        "<img src=\"https://i.stack.imgur.com/ALgZi.jpg?s=48&g=1\" alt=\"StackOverflow user Caleb\n" +
                        "Kleveter\">\n" +
                        "By specifying the width and height of an image, your structure gives the browser a hint as to how\n" +
                        "the page should be laid out even if you are just specifying the actual image size. If the image\n" +
                        "dimensions are not specified, the browser will need to recalculate the layout of the page after the\n" +
                        "image is loaded, which may cause the page to \"jump around\" while it's loading.\n"
        };

        ListView listView;
        CustomListAdapter custom = new CustomListAdapter(this,topicArray,aboutArray,chapterArray);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(custom);

        listView.setOnItemClickListener(new OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Home.this,DetailActivity.class);
                String message = contentArray[position];
                intent.putExtra("About",message);
                startActivity(intent);
            }
        });


    }
}