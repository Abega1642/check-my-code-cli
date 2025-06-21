# 🧪 check-my-code-cli (`hmr`)

**`hmr`** — short for *hamarino* (“verify it” in Malagasy) — is a blazing-fast CLI tool that generates professional-grade starter projects with everything set up for you: code formatting, linting, pre-commit validation, GitHub CI workflows, and language-specific best practices.

---

### 🎯 Purpose

Starting a new project? `hmr` instantly scaffolds a clean, production-ready environment that enforces **code quality, consistency, and reliability** — so you can skip the boilerplate and focus on solving real problems.

---

### 🧰 What You Get (Output)

When you run `hmr init`, your output project will include:

✅ **Formatted source code** using tools like Spotless (Java) or Black (Python)
✅ **Static analysis** via PMD, Checkstyle, or Flake8 — preconfigured
✅ **Git initialized**, `.gitignore` added, and a ready-to-go `README.md`
✅ **GitHub Actions workflows** to auto-check code on every push/PR
✅ **Pre-commit hook** that blocks bad code before it ever gets committed
✅ **Clean directory structure** tailored to the chosen language and toolchain
✅ **Modern configuration** that follows industry standards and best practices

---

### 💡 Why Use `hmr`?

Manually copying configs across projects is slow, error-prone, and inconsistent. `hmr` automates the setup of **reliable, maintainable, secure** codebases with **zero compromise on quality** — every time.

Whether you're coding in Java, Python, C, or C++, `hmr` helps you enforce your standards from the very first commit.

---

### 🧑‍💻 Example

```bash
$ hmr init --lang=java --lang-version=22 --dep-manager=maven \
           --name=my-app --github-action --pre-commit --git
```

This generates a fully working Maven project named `my-app`, preconfigured with:

* Spotless and PMD
* Git + pre-commit hook
* GitHub Actions CI for linting and code quality

---

### Built by developers who care about code that lasts.
> Abegà Razafindratelo
