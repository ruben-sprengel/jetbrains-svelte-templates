# How to Contribute

Thank you for your interest in contributing to jetbrains-svelte-templates! Every type of contribution is welcome, whether it's reporting a bug, suggesting a new feature, or submitting code improvements.

To ensure a smooth collaboration for everyone, we kindly ask you to follow these guidelines.

# Table of Contents

- [Reporting a Bug](#reporting-a-bug)
- [Suggesting New Features](#suggesting-new-features)
- [Submitting a Pull Request](#submitting-a-pull-request)
- [Code Conventions](#code-conventions)
- [Licensing of Contributions](#licensing-of-contributions)

# Reporting a Bug

If you have found a bug in the live templates, please create a new Issue in the GitHub repository. Before creating a new issue, please check if the problem has already been reported.

Please include as much information as possible in your bug report:

- JetBrains IDE and Version: (e.g., WebStorm 2025.1)
- Svelte/SvelteKit Version: (if relevant)
- A clear and concise description of the bug: What happened? What did you expect to happen instead?
- Steps to Reproduce: A step-by-step guide on how to reproduce the error.
- Example Code: A code snippet that demonstrates the problem.
- Screenshots or GIFs: Visual representations are often very helpful to clarify the issue.

# Suggesting New Features

Do you have an idea for a new live template or an improvement for an existing one? We welcome your suggestions! Please create a new Issue for this as well and use the "Feature Request" template if available.

Describe your idea in as much detail as possible:

- Problem Description: What problem or use case does your proposed feature solve?
- Proposed Solution: How do you envision the implementation? What shortcut should the template have (e.g., sv-if)?
- Alternatives: Have you considered any alternative solutions or features?
- Additional Context: Any other information that helps us better understand your proposal.

# Submitting a Pull Request

If you want to contribute code yourself to fix bugs or implement new features, please follow these steps:

- Fork the Repository: Create your own copy of the repository on GitHub.
- Clone Your Fork: Download your fork to your local machine.

`git clone https://github.com/ruben-sprengel/jetbrains-svelte-templates.git`

- Create a New Branch: Always work in a separate branch for your changes.

`git checkout -b feature/my-new-template`

- Make Your Changes: Implement your improvements or bug fixes.

- Commit Your Changes: Write clear and meaningful commit messages.

`git commit -m "feat: Add new live template for Svelte 5 'rune'"`

- Push Your Changes: Upload your changes to your fork.

`git push origin feature/my-new-template`

- Create a Pull Request: Open a pull request from your branch to our main branch. Please provide a clear description of your changes and reference the related issue (if any).

# Code Conventions

As this project consists of live templates for JetBrains IDEs, there are some specific conventions to follow. The templates are generally defined as XML files.

- File Structure: New templates should be added to the appropriate XML file (e.g., Svelte.xml or SvelteKit.xml).
- Template Structure: Adhere to the existing format of the XML entries for new templates. Ensure clear naming and a meaningful description.
- Variables: Use the predefined JetBrains variables ($END$, $SELECTION$, etc.) consistently.

# Licensing of Contributions

By contributing to this project, you agree that your contributions will be licensed under its [MIT License](https://github.com/ruben-sprengel/jetbrains-svelte-templates/blob/main/LICENSE).

# Thank you for taking the time to contribute to this project! 
