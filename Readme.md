# Review 3

My third review* with a project overview set by a company called Mega Soft Weird, who produces a word processor that acts as a spell checker.


<i>* A third-party assessed process review. The call lasts an hour, and the challenge is laid out at the beginning with a non-technical user story. The reviewee must ask questions until there is a clear technical translation of the requirements, and then test, and implement the user story.
</i>

Here are the requirement outlines:

## Input Examples- English only
<i>User can input a string of unlimited length</i>
```
spellChecker('Hello')
spellChecker('Hellp World')
spellChecker('Hello thene')
spellChecker('Hello there I am Wormd')
```

## Output Examples
```
'Hello'
'~Hellp~  World'
'Hello ~thene~'
'Hello there I am ~Wormd~'
```

## Approach
This repo looks at an [inside-out](https://8thlight.com/blog/georgina-mcfadyen/2016/06/27/inside-out-tdd-vs-outside-in.html) approach to testing, which meant building up each test incrementally until full functonality was in place.