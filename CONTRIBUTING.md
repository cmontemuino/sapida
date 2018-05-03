Welcome! Thank you for contributing to SaPiDa!
==============================================
The [Standard Github fork&pull][Github Fork and Pull] approach needs to be followed. Just fork this repo, develop
in a branch, and submit a PR!

Opening pull requests
---------------------
Shamelessly stolen from [lihaoyi/ammonite](https://github.com/lihaoyi/Ammonite).

- **All code PRs should come with**: a meaningful description, inline-comments
  for important things, unit tests (positive and negative), and a green build
  in [CI](https://travis-ci.org/cmontemuino/sapida).
- **Format your code with scalafmt**. Please be aware that the scalafmt plugin
  is configured to format scala sources on compile, so you shouldn't worry about
  it, but anyway, it might worth trying to manually format the code.
- **Creating commits and writing commit messages**. You may grab some inspiration
  from [here][Git Commit Messages].
- **PRs for features should generally come with *something* added to the
  [Documentation](https://github.com/cmontemuino/sapida)**, so people can discover
  that it exists. The docs are written in `readme/Readme.scalatex`.
- **Be prepared to discuss/argue-for your changes if you want them merged**!
  You will probably need to refactor so your changes fit into the larger
  codebase - **If your code is hard to unit test, and you don't want to unit
  test it, that's ok**. But be prepared to argue why that's the case!
- **It's entirely possible your changes won't be merged**, or will get ripped
  out later. This is also the case for my changes, as the Author!
- **Even a rejected/reverted PR is valuable**! It helps explore the solution
  space, and know what works and what doesn't. For every line in the repo, at
  least three lines were tried, committed, and reverted/refactored, and more
  than 10 were tried without committing.
- **Feel free to send Proof-Of-Concept PRs** that you don't intend to get merged.

Git Configuration
-----------------
Special attention must be paid with line endings.

*nix
```bash
git config --global core.autocrlf input
```

Windows
```bash
git config --global core.autocrlf true
```

For further details, please [read the docs][Git Line Endings].

## Git Ignoring Rules
Please bear in mind that it is **extrictly forbidden** to commit any code that is not project related. For instance, pull requests containing any of the following **will be rejected**:

* IDE metadata (e.g., Eclipse, IntelliJ, etc.)
* Editor's metadata (e.g., VIM, Notepad++, etc.)
* Temp/OS files (e.g., *.DS_Store, *.bak, etc.)

You first needs to create a `.gitignore` file and put it somewhere. For example, under your user profile folder.

You could use [Git Ignore site][Git Ignore] for generating the ignoring rules.

Then you need to instruct GIT to use the provided file containing the global exclusions.

*nix
```bash
git config --global core.excludesfile '~/.gitignore'
```

Windows cmd:
```bash
git config --global core.excludesfile "%USERPROFILE%\.gitignore"
```

You can get further details about global ignore files [here][Global Git Ignore].

## Opening issues

* Examples with diffs are better than words
* Always include your expected behavior
* Make it reproducible
* No complaining

[Git Commit Messages]: http://tbaggery.com/2008/04/19/a-note-about-git-commit-messages.html
[Github Fork and Pull]: https://help.github.com/articles/about-pull-requests/
[Git Ignore]: https://www.gitignore.io/
[Git Line Endings]: https://git-scm.com/docs/gitattributes
[Global Git Ignore]: https://help.github.com/articles/ignoring-files/#create-a-global-gitignore
