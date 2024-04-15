# PressPlanner User Guide

## Table Of Contents

* [1. Introduction](#1-introduction)
  * [1.1. Using this Guide](#1-1-using-this-guide)
  * [1.2. Why Use PressPlanner](#1-2-why-use-pressplanner)
* [2. Getting Started](#2-getting-started)
  * [2.1. Installation](#2-1-installation)
  * [2.2. Launching the App](#2-2-launching-the-app)
  * [2.3. The Beginner's Guide to PressPlanner](#2-3-the-beginner-s-guide-to-pressplanner)
* [3. Features](#3-features)
  * [3.1. Managing Contacts](#3-1-managing-contacts)
    * [3.1.1. Adding a Person](#3-1-1-adding-a-person-add)
    * [3.1.2. Deleting a Person](#3-1-2-deleting-a-person-delete)
    * [3.1.3. Listing All Persons](#3-1-3-listing-all-persons-list)
    * [3.1.4. Editing a Person](#3-1-4-editing-a-person-edit)
    * [3.1.5. Searching for a Person by Name](#3-1-5-searching-for-a-person-by-name-find)
    * [3.1.6. Lookup Associated Articles](#3-1-6-lookup-associated-articles-lookup)
    * [3.1.7. Sorting Persons by Name](#3-1-7-sorting-persons-by-name-sort-n)
    * [3.1.8. Clearing All Persons](#3-1-8-clearing-all-persons-clear)
  * [3.2. Managing Articles](#3-2-managing-articles)
    * [3.2.1. Adding an Article](#3-2-1-adding-an-article-add-a)
    * [3.2.2. Deleting an Article](#3-2-2-deleting-an-article-delete-a)
    * [3.2.3. Listing All Articles](#3-2-3-listing-all-articles-list-a)
    * [3.2.4. Editing an Article](#3-2-4-editing-an-article-edit-a)
    * [3.2.5. Searching for an Article by Headline](#3-2-5-searching-for-an-article-by-headline-find-a)
    * [3.2.6. Filtering Articles](#3-2-6-filtering-articles-filter-a)
    * [3.2.7. Removing a Filter](#3-2-7-removing-a-filter-rmfilter-a)
    * [3.2.8. Lookup Associated Persons](#3-2-8-lookup-associated-persons-lookup-a)
    * [3.2.9. Sorting Articles by Date](#3-2-9-sorting-articles-by-date-sort-a-d)
    * [3.2.10. Opening a Webpage for an Article](#3-2-10-opening-a-webpage-for-an-article)
  * [3.3. Other Commands](#3-3-other-commands)
    * [3.3.1. Viewing Help ](#3-3-1-viewing-help-help)
    * [3.3.2. Exiting PressPlanner](#3-3-2-exiting-pressplanner-exit)
* [4. Commands Quick Reference](#4-commands-quick-reference)
* [5. Upcoming Features](#5-upcoming-features)
  * [5.1. Clearing all Articles](#5-1-clearing-all-articles)
  * [5.2. Filtering People](#5-2-filtering-people)
* [6. FAQs](#6-faqs)

<div style="page-break-after: always;"></div>

## [1. Introduction](#table-of-contents)
### [1.1. Using this Guide](#1-introduction)
This guide is intended to help you get started with PressPlanner. It will guide you through the installation process, provide a brief overview of the app's features, and give you a quick reference to the commands you can use. All sections headers will link you back to the start of their parent section, so you can easily navigate the guide.

### [1.2. Why Use PressPlanner?](#1-introduction)
PressPlanner was built with **freelance journalists in mind**. It acts as your contact list linked together with a collection of articles, helping you keep track of your contacts and articles.

Unlike major firms, freelancers often lack the same wealth of contacts and resources. PressPlanner helps you maximise the value you can get from your contacts, by providing a platform to store and manage them and keeping track of which contacts you've worked with for different articles.

PressPlanner's main features are its ability to help you:
1. Develop deeper story angles and reconnect with past interviewees or collaborators.
   - [Filter](#3-2-6-filtering-articles-filter-a) by tags to find past articles on a specific topic.
   - [Lookup](#3-2-8-lookup-associated-persons-lookup-a) persons of interest related to those past articles.
   - Contact these persons for interviews or collaboration.

1. Follow up on breaking stories
   - [Filter](#3-2-6-filtering-articles-filter-a) by status and tags to find published articles related to breaking news.
   - Make changes to your article as the story develops.

PressPlanner's tagging system for [persons](#3-1-managing-contacts) and [articles](#3-2-managing-articles) is flexible and powerful:
- Customise your use of tags and still leverage the app's search and filter functions.

## [2. Getting Started](#table-of-contents)

### [2.1. Installation](#2-getting-started)
1. Ensure that you have Java `11` or above installed on your computer.
    - Download Java 11 from [the official Oracle website](https://www.oracle.com/java/technologies/downloads/#java11).
    - If you are unsure what version of java you have, use [this guide](https://www.java.com/en/download/help/version_manual.html) to check.
1. Download the jar file from [our latest release](https://github.com/AY2324S2-CS2103T-F12-2/tp/releases).
1. Move it to an **Empty** folder.

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

App data will be stored in sub-folders from where it is launched. While you could run the app from any location, we recommend making a dedicated folder for our app to avoid confusion.
</div>

### [2.2. Launching the App](#2-getting-started)
1. Open a command terminal, change directories into the folder you put the jar file in, and use the `java -jar pressplanner.jar` command to run the application.
   * For Windows users, you can use the [`cd` command](https://learn.microsoft.com/en-us/windows-server/administration/windows-commands/cd) to change directories and the `dir`command to list files in the current directory.
   * For macOS and Linux users, you can use the [`cd` command](https://help.ubuntu.com/community/UsingTheTerminal) to change directories and the `ls` command to list files in the current directory.
1. A window similar to the one below should appear in a few seconds. Note how the app contains some sample data. The information on what each data field represents is shown in the picture below.

<img src="images/UiDescription.png" alt="UI">

### [2.3. The Beginner's Guide to PressPlanner](#2-getting-started)

<div markdown="block" class="alert alert-primary">

**:bulb: Tip**<br>

This section covers commands first-time users might need. For the full commands list, refer to the [Features](#3-features) section.
</div>

Let's go over the basic PressPlanner workflow. Say you've just finished interviewing a certain Gill Bates. You want to save his contact for later and keep track of your article.

1. Selecting the command box at the top of the page, let's first add Gill Bates to PressPlanner's address book list.
   - To `add` a contact we need to include the following information separated by their prefixes:
       - Name (`n/`)
       - Phone number (`p/`)
       - Email (`e/`)
       - Address (`a/`)
     - For example: `add n/Gill Bates p/12345678 e/gillbates@sicromoft.com a/Sicromoft HQ`

     <div markdown="block" class="alert alert-info">
     
     **:information_source: Important**<br>
     
     Adding an article uses the [`add -a` command](#3-2-1-adding-an-article-add-a), the `-a` standing for article.<br>
       * Note that the `-a` suffix is used for all commands pertaining to articles.<br>
     </div>
  
1. Next let's add that article you just wrote.
   - To `add -a` an article we need the following information:
       - Headline (`h/`)
       - Date (`d/`)
         - We use a single field for the date.
       - Status (`s/`)
         - An article can be a `draft`, `published`, or `archived`.
     - For example: `add -a h/Example Article d/20-10-2023 s/draft`

<div style="page-break-after: always;"></div>

   <div markdown="block" class="alert alert-warning">
   
   **:warning: Warning**<br>
   You should only use headline (`h/`), date (`d/`) and status (`s/`) prefixes once each. If you use multiple prefixes only the last prefix's value will be used:<br>
        * eg. `add -a h/My Article d/20-10-2023 s/draft h/My Second Article` will add an article titled `My Second Article`.<br>
        * eg. `add -a h/My Article d/01-01-2024 s/draft d/02-02-2024` will add an article with the date `02-02-2024`.<br>
   </div>

1. Now that that's done, let's say you need to find Gill Bate's number to arrange another interview.
    - Typing the command `find Gill Bates` will pull up his contact.

1. If you made a mistake or want to see all your contacts again:
    - Typing the command `list` will bring up all your contacts.

1. If you want to look up your article:
    - Typing the command `find -a Example Article` will pull up the article.

1. If you want to see all your articles again:
    - Typing the command `list -a` will bring them all up.

Now that you know the basic workflow, go ahead and try it out for yourself. If you want to learn more commands, use the `help` command in-app or refer to the [features](#3-features) section of this guide.

As you become more familiar with the app, use tags as you see fit to customise your workflow!
- Here are some ideas to get you started:
  - Using tags to rate interviewees' compliance and reliability.
  - Noting down how many clicks articles got in the first 24 hours.
  - Using tags to mark articles with potential for follow-up development.

<div style="page-break-after: always;"></div>

## [3. Features](#table-of-contents)

<div markdown="block" class="alert alert-info">

**:information_source: Important**<br>

Here are some important terms that will be used in this section:

1. Commands are composed of a **command word** potentially followed by a few **prefixes** and their corresponding **parameters**.
   * For the example command `example p/PARAMETER`:
     * `example` is the command word.
     * `p/` is the prefix.
     * `PARAMETER` is the parameter to be supplied by you.

1. `INDEX` is a parameter you may come across frequently. It refers to the index number shown in the current list view.
   * `INDEX` must be a positive integer.
   * An `INDEX` not present in the current list view is invalid.
   * For example using the sample data shown below, indexes 1 - 6 are valid for persons, and index 1 is valid for articles: 

      ![sample data](images/sampleData.png)

<div style="page-break-after: always;"></div>

1. Words in `UPPER_CASE` are the parameters to be supplied by you.
   * Refer to point 1 for the breakdown of the command structure.
   * For the example command `example p/PARAMETER`:
      * `PARAMETER` is the parameter to be supplied by you.
        * The correct use of this command would thus be: `example p/my input`, replacing `PARAMETER` with your own input.
   * For the real command [`delete INDEX`](#3-1-2-deleting-a-person-delete):
     * `INDEX` is the parameter to be supplied by you.
       * The correct use of this command would thus be: `delete 1`, replacing `INDEX` with a valid index.

1. Items in square brackets are optional.
   * For the example command `example p/PARAMETER [t/TAG]`:
     * `example p/my input` is a valid use of the command.
     * `example p/my input t/my tag` is also a valid use of the command.

1. Items with `...` after them can be used multiple times. If the item is also in square brackets, it can even be used zero times.
   * For the example command `example p/PARAMETER [t/TAG]...`:
     * `example p/my input` is a valid use of the command.
     * `example p/my input t/my tag` is also a valid use of the command.
     * `example p/my input t/my tag t/my other tag` is also a valid use of the command.

1. Parameters can be in any order.
   * For the example command `example p/PARAMETER [t/TAG]...`:
     * `example p/my input t/my tag` is a valid use of the command.
     * `example t/my tag p/my input` is also a valid use of the command.
     * `example t/my tag p/my input t/my other tag` is also a valid use of the command.
     
1. Extraneous inputs for commands that do not take in parameters will be ignored.
   * This specifically refers to the [`help`](#3-3-1-viewing-help-help), [`list`](#3-1-3-listing-all-persons-list), [`list -a`](#3-2-3-listing-all-articles-list-a), [`exit`](#3-3-2-exiting-pressplanner-exit) and [`clear`](#3-1-8-clearing-all-persons-clear) commands.
   * e.g. `help 123` will be interpreted as `help`.
   
1. Prefixes are case-insensitive.
   * Only **prefixes** are always case-insensitive, **command words** are case-sensitive.
     * Refer to point 1 if you are unsure of the terminology and command structure.
   * For the example command `example p/PARAMETER`:
     * `example p/my input` is a valid use of the command.
     * `example P/my input` is also a valid use of the command.
     * `EXAMPLE p/my input` is not a valid use of the command.
     
1. Only correct prefixes will be recognised and accepted.
   * Taking the [`add -a` command](#3-2-1-adding-an-article-add-a) for example:
     * The command: `add -a h/My Headline invalid/ignore d/01-01-2024 s/draft` will not recognise `invalid/ignore` as a valid prefix and parameter pair.
       * As a result, the command will interpret `My Headline invalid/ignore` as the headline and add a new article with the headline `My Headline invalid/ignore`.
     * The command: `add -a h/My Headline d/01-01-2024 s/draft t/my tag invalid/ignore` will not recognise `invalid/ignore` as a valid prefix and parameter pair.
       * As a result, the command will interpret `my tag invalid/ignore` as the attempted tag.
       * This will display an error message prompting you to only use alphanumeric characters for tags.
</div>

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

If you are using a PDF version of this document, be careful when copying and pasting commands with line breaks as they may not paste correctly.
</div>

<div style="page-break-after: always;"></div>

## [3.1. Managing Contacts](#3-features)
<div markdown="block" class="alert alert-info">

**:information_source: Important**<br>

Here are some important terms that will be used in this section:
1. `NAME`
    * Names must be alphanumeric.
    * Special characters are not allowed.
    * Whitespaces are allowed.
   
2. `PHONE_NUMBER`
    * Phone numbers must be numeric only.
    * Spaces and special characters are not allowed.
    * Phone numbers must be at least 3 digits long.
   
3. `EMAIL`
    * Emails must be in the format `local-part@domain`.
      * The local part can contain alphanumeric characters and the `+_.-` special characters.
      * The domain part must be:
        * Made up of domain labels separated by periods.
        * End with a domain label of at least 2 characters.
        * Have each domain label start and end with an alphanumeric character.
        * Have each domain label contain only alphanumeric characters and hyphens.

4. `ADDRESS`
   * Addresses can contain any characters.
   * Addresses cannot be left blank.

5. `TAG`
    * Tags are alphanumeric.
    * Tags are any keyword or phrase that helps categorise the person.
      * Customise your workflow with tags that make sense to you.
</div>

### [3.1.1. Adding a Person](#3-1-managing-contacts) : `add`

Adds a person to PressPlanner's address book.

Format: `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG]...`

<div markdown="block" class="alert alert-primary">

**:bulb: Tip**<br>

A person can have any number of tags (including 0).
</div>

Examples:
* `add n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01`
* `add n/Betsy Crowe e/betsycrowe@example.com a/Apple HQ p/1234567 t/Marketing Department t/Apple`

<div style="page-break-after: always;"></div>

### [3.1.2. Deleting a Person](#3-1-managing-contacts) : `delete`

Deletes the specified person from PressPlanner's address book.

Format: `delete INDEX`

* Deletes the person at the specified `INDEX`.

Examples:
* `delete 2` deletes the 2nd person in the current address book view.

<div markdown="block" class="alert alert-info">

**:information_source: Important**<br>

Commands such as [`find`](#3-1-5-searching-for-a-person-by-name-find) can alter the current view of the address book. The `INDEX` refers to the index number shown in the current view.
</div>

### [3.1.3. Listing All Persons](#3-1-managing-contacts) : `list`

Shows a list of all persons in PressPlanner's address book.
* Use this command to restore the full list of persons after using other commands.

Format: `list`

### [3.1.4. Editing a person](#3-1-managing-contacts) : `edit`

Edits an existing person in PressPlanner's address book.

Format: `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [t/TAG]...`

* Edits the person at the specified `INDEX`.
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

When editing tags, the existing tags of the person will be removed i.e. adding of tags is not cumulative.
* You can remove all the person’s tags by typing `t/` without specifying any tags after it.
</div>

<div markdown="block" class="alert alert-info">

**:information_source: Important**<br>

Editing the name of a person will automatically update their names in articles referencing them as contributors or interviewees.
</div>

Examples:
*  `edit 1 p/91234567 e/johndoe@example.com` Edits the phone number and email address of the 1st person to be `91234567` and `johndoe@example.com` respectively.
*  `edit 2 n/Betsy Crowe t/` Edits the name of the 2nd person to be `Betsy Crowe` and clears all existing tags.

<div style="page-break-after: always;"></div>

### [3.1.5. Searching for a Person by Name](#3-1-managing-contacts) : `find`

Finds persons whose names contain any of the given keywords.

Format: `find KEYWORD [MORE_KEYWORDS]`

* The search is case-insensitive. e.g. `hans` will match `Hans`.
* The order of the keywords does not matter. e.g. `Hans Bo` will match `Bo Hans`.
* Only the name is searched.
* Only full words will be matched e.g. `Han` will not match `Hans`.
* Persons matching at least one keyword will be returned (i.e. `OR` search).
  e.g. `Hans Bo` will return `Hans Gruber`, `Bo Yang`

Examples:
* `find John` returns `john` and `John Doe`
* `find alex david` returns `Alex Yeoh`, `David Li`

* Before finding:

  ![Before finding](images/beforeFindLookupPerson.png)

* After finding using `find chester`:
  
  ![After finding](images/findPerson.png)

<div style="page-break-after: always;"></div>

### [3.1.6. Lookup Associated Articles](#3-1-managing-contacts) : `lookup`

Display articles associated with the person where they are contributors or interviewees.

Format: `lookup INDEX`

* Display articles related to the person at the specified `INDEX`
* The matching of persons to articles is based on the person's name.
    * It is case-sensitive (e.g. Looking up `John` in the address book will not match articles with `john` as an interviewee or contributor).
    * It is an exact match of the person's full name (e.g. Looking up `John` in the address book will not match articles with `Johnny` or `John Doe` as interviewees or contributors).

Examples:
* `lookup 1` returns all articles associated with the first person in the list of contacts.

* Before lookup:

  ![Before lookup](images/beforeFindLookupArticle.png)

* After lookup using `lookup 2`:
  * (The articles associated with the second person in the list of contacts are shown)

    ![After lookup](images/lookupPerson.png)

### [3.1.7. Sorting Persons by Name](#3-1-managing-contacts) : `sort n/`

Sorts persons in ascending order by the lexicographical (alphabetical) ordering of their names.

Format: `sort n/`

* Executing the `sort n/` command sorts all persons in PressPlanner permanently.
  * This works differently from commands which change the current view temporarily (e.g. [find](#3-1-5-searching-for-a-person-by-name-find)).
  * Closing and reopening the app in future will result in contacts remaining sorted by name.
* Sorting is only done when the command is executed and not automatically maintained afterwards:
    * A person added using `add` after a `sort n/` command will be added to the end of the address book, regardless of their name.
    * A person edited using `edit` to change their name after a `sort n/` command will not change its position in the address book.

Example:
* `sort n/` sorts all persons in PressPlanner in ascending order by the lexicographical (alphabetical) ordering of their names.

* Before sorting:
  * (Aaron Tan and Barry Allen are recent additions to the template data and are currently at the end of the list)

    ![before sorting people](images/beforeSortingPeople.png)

* After sorting:
  * (Both Aaron Tan and Barry Allen moved up the list and are now in ascending order with respect to alphabetical ordering of their names)

    ![after sorting people](images/afterSortingPeople.png)

* Success message shown:
  * `sorted all persons by name`


### [3.1.8. Clearing All Persons : `clear`](#3-1-managing-contacts)

Clears all entries from the address book.

Format: `clear`

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

This action is irreversible. All persons will be deleted from the address book. The app will not prompt you to confirm this action.
</div>

## [3.2. Managing Articles](#3-features)
PressPlanner's article management system is designed to help you keep track of your articles and the people involved in them. As a freelancer, you lack the same resources a major firm has. PressPlanner helps you maximise the value you can get from your contacts by helping you keep track of which contacts you've worked with for different articles.

<div markdown="block" class="alert alert-primary">

**:bulb: Tip**<br>

Refer to [Why Use PressPlanner?](#1-2-why-use-pressplanner) for some of our recommended workflows and how PressPlanner can help you.
</div>

<div markdown="block" class="alert alert-info">

**:information_source: Important**<br>

Here are some important terms that will be used in this section:
1. `DATE`
   * All articles have a mandatory `DATE` field. This field is also used in commands like [`filter`](#3-2-6-filtering-articles-filter-a)
   * `DATE` must be in the format `dd-mm-yyyy [HH:mm]`.
     * `HH:mm` is optional and defaults to `00:00` if not provided.
     * `HH:mm` must be in 24-hour format.
   * Examples of valid dates: `01-01-2023`, `01-01-2023 22:30`
2. `STATUS`
   * All articles have a mandatory `STATUS` field.
   * `STATUS` can be:
     1. `draft`
     2. `published`
     3. `archived`.
   * The `STATUS` parameter is not case-sensitive (e.g. `draft` and `DRAFT` are both valid inputs).
</div>

### [3.2.1. Adding an Article](#3-2-managing-articles) : `add -a`
Adds a new article to PressPlanner's database.

Format: `add -a h/HEADLINE  d/DATE s/STATUS [c/CONTRIBUTOR]... [i/INTERVIEWEE]... [t/TAG]...[o/OUTLET]... [l/LINK]`

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

1. Only `HEADLINE`, `DATE`, and `STATUS` are mandatory fields.
    * Refer to [Managing Articles](#3-2-managing-articles) for the valid formats of `DATE` and `STATUS`.
    * An article's `HEADLINE` must be unique **unless it is a `draft`**
      * `HEADLINE` accepts any characters, but spaces at the start will be automatically removed.
      * `HEADLINE` can also be left blank. This is not recommended, but allowed for flexibility.
        * e.g. `add -a h/ d/20-10-2023 s/draft` is a valid command and will add an article with a blank headline.
        * Some users may find this useful for adding drafts quickly and filling in the headline later.
    * An article's `DATE` can represent what you choose to be relevant to your workflow, we recommend using it to represent:
      * Time of creation for drafts.
      * Time of publication for published articles.
2. Entering multiple prefixes for any of these fields will overwrite the previous values.
    * e.g. `add -a h/My Article d/20-10-2023 s/draft h/My Second Article` will add an article titled `My Second Article`.
    * e.g. `add -a h/My Article d/01-01-2024 s/draft d/02-02-2024` will add an article with the date `02-02-2024`.
</div>

* A `CONTRIBUTOR` is a co-author or information source that was not directly interviewed for an article.
* An `INTERVIEWEE` is a person directly interviewed for an article.
  * If a `CONTRIBUTOR` or `INTERVIEWEE` has the same name as a contact in PressPlanner's address book, [`lookup`](#3-1-6-lookup-associated-articles-lookup) and [`lookup -a`](#3-2-8-lookup-associated-persons-lookup-a) commands can be used to find articles and persons associated with each other.
* An `OUTLET` is the publication or platform the article was published on.
* A `TAG` is any keyword or phrase that helps categorise the article.
* A `LINK` is a URL to the article.

<div markdown="block" class="alert alert-info">

**:information_source: Important**<br>

Adding an article will return to displaying all articles if a [find](#3-2-5-searching-for-an-article-by-headline-find-a) command was executed before.
  * This does not apply to [filters](#3-2-6-filtering-articles-filter-a).
</div>

Examples:
* `add -a h/iPhone 13 Review d/20-03-2024 s/draft c/John Doe i/Michael Lee t/New Releases`
* `add -a h/AI Inc. Acquired by Google d/30-08-2024 08:45 s/published c/Alex Johnson i/Emily Brown t/AI o/CNA l/www.example.com`

### [3.2.2. Deleting an Article](#3-2-managing-articles) : `delete -a`

Deletes an existing article from PressPlanner's database.

Format : `delete -a INDEX`

* Deletes the article at the specified `INDEX`.
  * The `INDEX` refers to the index number shown in the current article list view.
    * If a `filter`, `sort` or `find` command was executed before, the index refers to the index number shown in the filtered/sorted list of articles.
    * e.g. `delete 1` after the `find` command deletes the first article found by the `find` command.

Example : `delete -a 1` deletes the article at the first index.

### [3.2.3. Listing All Articles](#3-2-managing-articles) : `list -a`

List out all articles in PressPlanner's database.

Format: `list -a`

* No parameters necessary.
  * Extra characters in the command (e.g. `list -ab`, `list -a1`) will be ignored and treated as `list` for persons instead.
  * Extra whitespace characters in the command (e.g. `list -a `, `list -a  `) are acceptable.
  * Extra characters after a whitespace will be ignored (e.g. `list -a 123` will be interpreted as `list -a`).

### [3.2.4. Editing an Article](#3-2-managing-articles) : `edit -a`

Edits an existing article in PressPlanner's database.

Format: `edit -a INDEX [h/HEADLINE] [d/DATE] [s/STATUS] [c/CONTRIBUTOR]... [i/INTERVIEWEE]... [t/TAG]... [o/OUTLET]... [l/LINK]`

* Edits the article at the specified `INDEX`.
* **At least one** of the optional fields must be provided.
* Refer to the [`add -a` command](#3-2-1-adding-an-article-add-a) for the format of each field.
  * Note that `edit -a` will also behave the same as `add -a` in terms of returning to the full list of articles if used after a `find` command.

<div style="page-break-after: always;"></div>

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

* Editing an article will be updated any included field to the new input.
  * i.e. The original values will be overwritten by the new values.
    * `c/`, `i/`, `t/`, `o/` and `l/` without any value after it will clear all existing values.
    * e.g. `c/new contributor` will replace all existing contributors with `new contributor`.
* Editing is irreversible, so make sure you have the correct information before executing the command.
</div>

Examples:
*  `edit -a 1 h/iPhone Review` Edits the headline of the 1st article to be `iPhone Review`.
*  `edit -a 2 h/iPhone Review i/` Edits the headline of the 2nd article to be `iPhone Review` and clears all existing interviewees.

### [3.2.5. Searching for an Article by Headline](#3-2-managing-articles) : `find -a`

Find articles with headlines containing any of the given keywords.

Format: `find -a KEYWORD [MORE_KEYWORDS]`

* Only the headline is searched for matches.
* The search is case-insensitive.
  * e.g `iphone` will match `iPhone`
* The order of the keywords does not matter.
    * e.g. `Pro Vision` will match `Vision Pro`
* Only full words will be matched.
  * e.g. `iPhone` will not match `iPhones`
* Articles matching at least one keyword will be returned.
  * e.g. `find -a Vision Pro` will return an article with the headline: `Pro tips for Windows 10 Users`

Examples:
* `find -a Vision Pro` returns articles with headlines containing `Vision` or `Pro`.

* Before finding:

  ![Before finding](images/beforeFindLookupArticle.png)

* After finding using `find -a iphone`:

  ![After finding](images/findArticle.png)

### [3.2.6. Filtering Articles](#3-2-managing-articles) : `filter -a`

Filter PressPlanner's database by a combination of attributes to find articles you are looking for quickly.

Format: `filter -a s/STATUS t/TAG ST/START_DATE EN/END_DATE`
* All the prefixes need to be included, but can be left blank.
  * e.g. `filter -a s/ t/ st/ en/` is a valid command
  * e.g. `filter -a s/ t/ st/` is not a valid command
  * Leaving `st/` or `en/` blank defaults to the earliest or latest date possible respectively.
* Use the `filter` command **prior to a `find` command**.
  * `filter` will list all matching articles within the database when first applied.
  * `find` can be used to then search the filtered list.
    * Using `filter` after a `find` command will overwrite the previous `find` command.
* Filters are not stored between sessions, so make sure to finish your search before closing the app!
* Filters will apply until you [remove](#3-2-7-removing-a-filter-rmfilter-a) it or apply a new filter, so make sure you [remove](#3-2-7-removing-a-filter-rmfilter-a) it after you are done!
* Refer to the [add article](#3-2-1-adding-an-article-add-a) command for the format of each field.
  * Note that `START_DATE` and `END_DATE` must be in the same format as `DATE` in the [add article](#3-2-1-adding-an-article-add-a) command.
  * The `START_DATE` should come **before** the `END_DATE`. If not, you will receive an error!
  * The date of the article you are looking for should not be equal to the `START_DATE` or `END_DATE`.
* Only one filter command can be active at once, using another filter will override the last one.

Examples:
* `filter -a s/DRAFT t/ st/ en/` will restrict the display to showing only articles with draft status.
* Using the command:

  ![Before Filter](images/filterCommand.png)

* After the command:

  ![After Filter](images/filterAfter.png)

### [3.2.7. Removing a Filter](#3-2-managing-articles) : `rmfilter -a`
Remove all filters so that all articles in PressPlanner's database are displayed.

Format: `rmfilter -a`

* No additional parameters.
* The `-a` is necessary, additional letters will cause the command to fail.
  * Additional parameters after a whitespace will be ignored (e.g. `rmfilter -a 123` will be interpreted as `rmfilter -a`).
* Using the command:

  ![Remove Command](images/removeFilterCommand.png)

* After the command:

  ![After rm command](images/removeFilterAfter.png)

### [3.2.8. Lookup Associated Persons](#3-2-managing-articles) : `lookup -a`

Finds persons associated with an article as interviewees or contributors.

Format: `lookup -a INDEX`

* Display list of persons related to the article at the specified `INDEX`.
* The matching of articles to persons is based on the person's name.
    * It is case-sensitive (e.g. Looking up an article with `john` as an interviewee or contributor will not match `John` in the address book).
    * It is an exact match of the person's full name (e.g. Looking up an article with `John` as an interviewee or contributor will not match `Johnny` or `John Doe` in the address book).
  
Examples:
* `lookup -a 1` returns all persons associated with the first article in the list of articles.

* Before lookup:
  
  ![Before lookup](images/beforeFindLookupPerson.png)

* After lookup using `lookup -a 2`:
  * (Bob who was the contributor for the second article is shown in the list of persons associated with the article
   
    ![After lookup](images/lookupArticle.png)

### [3.2.9. Sorting Articles by Date](#3-2-managing-articles) : `sort -a d/`

Sort articles in PressPlanner's database in descending order by their date and time.

Format: `sort -a d/`

* Executing the `sort -a d/` command sorts all articles in PressPlanner permanently.
    * This works differently from commands which change the current view (e.g. [find](#3-2-5-searching-for-an-article-by-headline-find-a), [lookup](#3-2-8-lookup-associated-persons-lookup-a) or [filter](#3-2-6-filtering-articles-filter-a)).
    * Closing and reopening the app in future will result in articles remaining sorted by date.
* Sorting is only done when the command is executed and not automatically maintained afterwards:
  * An article added using `add -a` after a `sort -a d/` command will be added to the end of the list, regardless of its date.
  * An article edited using `edit -a` to change the date after a `sort -a d/` command will not change its position in the list.

Example:
* `sort -a d/` sorts all articles in PressPlanner in descending order by their date and time.

* Before sorting:
  * (The first and second articles are in ascending order by date)
  
    ![before sorting articles](images/beforeSortingArticles.png)

* After sorting:
  * (The articles are now in descending order by date)

    ![after sorting articles](images/afterSortingArticles.png)

* Success message shown:
  * `sorted all articles by date`

### [3.2.10. Opening a Webpage for an Article](#3-2-managing-articles)

* By clicking the `Link` button of your article that is highlighted in yellow box in the picture below, you can open up the webpage for your article that was included in the article.

  ![opening link](images/LinkFeatureSample.png)

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

PressPlanner does not check the validity of links. If the webpage does not open when clicked, it likely means that the `link` of the article is invalid.
</div>

## [3.3. Other Commands](#3-features)

### [3.3.1. Viewing Help](#3-3-other-commands) : `help`

Shows a message with the URL to access this User Guide.

* Can also be accessed via the button at the top of the app
* Can also be accessed via pressing the `F1` key on your keyboard

  ![help message](images/helpMessage.png)

Format: `help`
 
### [3.3.2. Exiting PressPlanner](#3-3-other-commands) : `exit`

Exits the program.

Format: `exit`

<div style="page-break-after: always;"></div>

## [4. Commands Quick Reference](#table-of-contents)
| Action                     | Command Format                                                                                                           | Example                                                                                                                        |
|----------------------------|--------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| List Persons               | `list`                                                                                                                   | `list`                                                                                                                         |
| Add Person                 | `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG]...`                                                                 | `add n/Betsy Crowe p/1234567 e/betsycrowe@example.com a/Apple HQ  t/Marketing Department t/Apple`                              |
| Delete Person              | `delete INDEX`                                                                                                           | `delete 3`                                                                                                                     |
| Edit Person                | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`                                                  | `edit 2 n/Betsy Crowe e/betsycrowe@example.com`                                                                                |
| Find Person                | `find KEYWORD [MORE_KEYWORDS]`                                                                                           | `find Crowe Betsy`                                                                                                             |
| Lookup Associated Articles | `lookup INDEX`                                                                                                           | `lookup 1`                                                                                                                     |
| Sort Persons by Name       | `sort n/`                                                                                                                | `sort n/`                                                                                                                      |
| Clear Persons              | `clear`                                                                                                                  | `clear`                                                                                                                        |
| List Article               | `list -a`                                                                                                                | `list -a`                                                                                                                      |
| Add Article                | `add -a h/HEADLINE d/DATE s/STATUS [c/CONTRIBUTOR]... [i/INTERVIEWEE]... [t/TAG]... [o/OUTLET]... [l/LINK]`              | `add -a h/AI Inc. Acquired by Google d/30-08-2024 08:45 s/published c/Alex Johnson i/Emily Brown t/AI o/CNA l/www.example.com` |
| Delete Article             | `delete -a INDEX`                                                                                                        | `delete -a 1`                                                                                                                  |
| Edit Article               | `edit -a INDEX [h/HEADLINE] [d/DATE] [s/STATUS] [c/CONTRIBUTOR]... [i/INTERVIEWEE]... [t/TAG]... [o/OUTLET]... [l/LINK]` | `edit -a 2 h/iPhone Review`                                                                                                    |
| Find Article               | `find -a KEYWORD [MORE_KEYWORDS]`                                                                                        | `find -a Vision Pro`                                                                                                           |
| Filter Articles            | `filter -a s/STATUS t/TAG ST/START_DATE EN/END_DATE `                                                                    | `filter -a s/draft t/Apple st/01-01-2024 en/`                                                                                  |
| Remove Filter              | `rmfilter -a`                                                                                                            | `rmfilter -a`                                                                                                                  |
| Lookup Associated People   | `lookup -a INDEX`                                                                                                        | `lookup -a 1`                                                                                                                  |
| Sort Articles              | `sort -a d/`                                                                                                             | `sort -a d/`                                                                                                                   |
| Help                       | `help`                                                                                                                   | `help`                                                                                                                         |
| Exit                       | `exit`                                                                                                                   | `exit`                                                                                                                         | 

<div style="page-break-after: always;"></div>

## [5. Upcoming Features](#table-of-contents)
### [5.1. Clearing all Articles](#5-upcoming-features)
In PressPlanner's current version, we have provided a command to clear all persons from the address book using the `clear` command. This is intended to help you clear all contacts in the case of personal data privacy and security concerns.

Users have requested a similar command to clear all articles from the article book to improve their personal workflows. We are working on implementing this feature in the near future.

* In the meantime, you can manually delete the `articlebook.json` file in the `data` folder to clear all articles.
  * For example, your articlebook may look something like this:
  
    ![before clearing](images/beforeDeletingJsonFile.png)
  * Simply go into the folder PressPlanner is in:
  
    ![PressPlanner folder](images/fileDirectoryBefore.png)
  * Go inside the data folder, which will look something like this:
  
    ![Data folder](images/insideDataBefore.png)
  * Delete the file named articlebook:
  
    ![Deleting file](images/insideDataAfter.png)
  * Now, if you open PressPlanner again, you will see that your articles will have changed back to the sample data:
  
    ![after clearing](images/afterDeletingJsonFile.png)
  * Now all you have to do is to delete the sample article, and you are set!

### [5.2. Filtering People](#5-upcoming-features)
In PressPlanner's current version, filtering is available for articles and intended to help you find articles that you may have forgotten the name of by other attributes such as date, status, tags, etc.

Users have requested a similar feature for persons. We are working on implementing this feature in the near future.

## [6. FAQs](#table-of-contents)
### [6.1. Why am I unable to run PressPlanner on my desktop?](#6-faqs)
* Please check that you have downloaded Version 11 Java SDK that suits your computer’s operating system (Windows, MacOS, Linux).
* If you are unsure of whether you have done so, please navigate back to the “Getting Started” Segment of the User Guide to access the link which will bring you to the Java Oracle Website where you can re-download the Version 11 Java SDK for your operating system.

### [6.2. How do I ensure that I have saved all the contacts and articles I have added in this session?](#6-faqs)
* Do not worry about issues regarding the saving of data you have entered into the application, they are saved into files automatically upon the execution of every command which modifies or adds new data.

### [6.3. Why were all my previous data for contacts (and / or) articles from previous sessions deleted and replaced by the default template data?](#6-faqs)
* This means that your save file was either corrupted or lost. To avoid this, refrain from editing files in the data folder (specifically **AddressBook.json** and **ArticleBook.json** files which contain the saved contacts and articles respectively, from previous sessions) unless you are sure about what you are doing.
* To mitigate possible accidental data corruption which may result in the deletion of the save files, please make a copy of the data files after every session where major changes were made, so that in the event the most recent data is lost, you would still have a recent data file which can then be added back into the data folder located at the working directory of the PressPlanner.jar file and be loaded up into the application.

### [6.4. Why does my link not open the browser?](#6-faqs)
* This means that your URL added to the PressPlanner is an invalid link.
* To let you know when the URL is invalid, we will soon be implementing the app to show you an error message when your link that is typed is invalid. Please wait for our future updates!
