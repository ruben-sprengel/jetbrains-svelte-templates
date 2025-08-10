[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/rubensprengel)
[![Jetbrains Marketplace](https://img.shields.io/jetbrains/plugin/v/28046?style=for-the-badge&label=Jetbrains%20Marketplace)](https://plugins.jetbrains.com/plugin/28046-svelte-templates)

# jetbrains-svelte-templates

Svelte and SvelteKit Live Templates for Jetbrains IDE

## Getting Started

This section guides you through the process of installing and getting started with the 'jetbrains-svelte-templates'
plugin for JetBrains IDEs.

## Prerequisites

Before you begin, ensure you have a compatible JetBrains IDE installed:

* **JetBrains IDE:** IntelliJ IDEA Ultimate/Community, WebStorm, Pycharm, etc
* **Version:** 2025.1 or later

## Installation

You have two primary ways to install the plugin:

### 1. Install from JetBrains Marketplace (Recommended)

This is the easiest and recommended method, assuming your plugin is published on the JetBrains Marketplace.

1. Open your JetBrains IDE.
2. Go to `File` > `Settings` on Windows/Linux, or `IntelliJ IDEA` / `[Your IDE Name]` > `Preferences` on macOS.
3. Navigate to `Plugins` in the left-hand menu.
4. Switch to the `Marketplace` tab.
5. In the search bar, type `Svelte Templates` or install from
   the [Marketplace page](https://plugins.jetbrains.com/plugin/28046-svelte-templates).
6. Click the `Install` button next to the plugin's listing.
7. After the installation is complete, you will be prompted to `Restart IDE`. Please do so to activate the plugin.

### 2. Install from Disk (Manual Installation)

Use this method if you have downloaded the plugin's `.jar` or `.zip` file directly (e.g., from a GitHub Release, for a
beta version, or during development).

1. **Download the Plugin:** Obtain the latest `.jar` or `.zip` file for the plugin from
   the [GitHub Releases page](https://github.com/ruben-sprengel/jetbrains-svelte-templates/releases).
2. Open your JetBrains IDE.
3. Go to `File` > `Settings` on Windows/Linux, or `IntelliJ IDEA` / `[Your IDE Name]` > `Preferences` on macOS.
4. Navigate to `Plugins` in the left-hand menu.
5. Click the **gear icon** (⚙️) or the **`[... ]`** button (depending on your IDE version) next to the `Installed` tab.
6. Select `Install Plugin from Disk...`.
7. Browse to the location where you downloaded the `[jetbrains-svelte-templates-$VERSION].jar` (oder `.zip`) file,
   select it, and click `OK` or `Open`.
8. You will be prompted to `Restart IDE`. Please do so to activate the plugin.

## Usage

Once installed, the `Svelte Templates` plugin extends your JetBrains IDE with powerful features for your Svelte
development.

The plugin provides Live Templates, you can find them and explore their usage under:

`Settings` > `Editor` > `Live Templates`

Here, you can see the available templates and their corresponding abbreviations (e.g., `sv-each-wo-item` for Svelte
`{#each}` with out `item`-variable). Simply type the abbreviation in your code and press `Tab` (default) to expand the
template.

### Important

Depends on your IDE settings if automated closing from HTML tags are too aggressive, use `ENTER` to switch to the next
`VAR` / `STEP`

## Features

### Available Svelte 5 Live Templates

- sv-attach (svelte attach)
- sv-await-catch (svelte await catch)
- sv-await-then (svelte await then)
- sv-await-wp-then (svelte await with pending then)
- sv-await-wp-then-catch (svelte await with pending then catch)
- sv-const (svelte const)
- sv-derived (svelte rune derived)
- sv-each (svelte each)
- sv-each-el (svelte each else)
- sv-each-el-index (svelte each else with index)
- sv-each-el-keyed (svelte each else keyed)
- sv-each-el-keyed-index (svelte each else keyed index)
- sv-each-el-wo-item (svelte each else without item)
- sv-each-el-wo-item-index (svelte each else without item index)
- sv-each-index (svelte each with index)
- sv-each-keyed (svelte each keyed)
- sv-each-keyed-index (svelte each keyed index)
- sv-each-wo-item (svelte each without item)
- sv-each-wo-item-index (svelte each without item index)
- sv-effect (svelte rune effect)
- sv-host (svelte rune host)
- sv-html (svelte html)
- sv-if (svelte if)
- sv-if-el (svelte if else)
- sv-if-el-if (svelte if else if)
- sv-inspect (svelte rune inspect)
- sv-inspect-trace ( svelte rune inspect trace)
- sv-inspect-with (svelte rune inspect with)
- sv-key (svelte key)
- sv-props (svelte rune props)
- sv-props-fallback-val (svelte rune props with fallback value)
- sv-props-id (svelte rune props id)
- sv-props-typed (svelte rune props typed)
- sv-props-typed-interface (svelte rune props typed with interface)
- sv-render (svelte render)
- sv-render-optional (svelte render optional)
- sv-render-optional-fallback (svelte render optional with fallback)
- sv-render-optional-params (svelte render optional with params)
- sv-render-params (svelte render params)
- sv-snippet (svelte snippet)
- sv-snippet-params (svelte snippet params)
- sv-state (svelte rune state)

### Available Svelte 5 Live Templates

- svk-config (sveltekit config)
- svk-csr (sveltekit csr)
- svk-error (sveltekit error)
- svk-form-action-default (sveltekit form action default)
- svk-form-action-named (sveltekit form action named)
- svk-form-action-wrapper (sveltekit form action wrapper)
- svk-get-route (sveltekit get route)
- svk-hooks (sveltekit hooks)
- svk-layoutload (sveltekit layout load)
- svk-pageload (sveltekit page load)
- svk-pageserverload (sveltekit page server load)
- svk-post-route (sveltekit post route)
- svk-prerender (sveltekit prerender)
- svk-ssr (sveltekit ssr)
- svk-trailingslash (sveltekit trailingslash)

## Contributing

We welcome contributions to expand and improve this collection of Live Templates!

If you have new templates, improvements to existing ones, or find issues, please check out our **[CONTRIBUTING.md](CONTRIBUTING.md)** guide for more details on how to get involved. Your contributions help make Svelte development even smoother for everyone.

## Support

If you find these Live Templates useful, please consider showing your support!

* **Star this repository** on GitHub. Your stars help us reach more developers.
* **Review and Star** the Svelte Plugin on the JetBrains Marketplace. Positive reviews encourage continued development.
* You can also sponsor this project if you'd like to offer further support. See 'sponsor' link on Github or Jetbrains Marketplace.

 **Thank You!**
