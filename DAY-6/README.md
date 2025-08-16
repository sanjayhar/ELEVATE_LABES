## Host a Static Website with GitHub Pages

## 1. Create Project Files

-> On your computer, create a folder 

-> Inside it, create:

    -> index.html 

    -> style.css 

## 2 . Initialize Git Repository

-> Open Git Bash / Terminal inside the folder.

Run:
```
git init
git branch -M main
git add .
git commit -m "Initial commit - fancy website"
```

### 3. Create a GitHub Repository

-> Go to GitHub.

-> Click New Repository.

    -> Repo name: fancy-website

    -> Keep it public.


### 4. Push Files to GitHub

Run the following in your terminal:

```
git remote add origin https://github.com/<your-username>/fancy-website.git
git push -u origin main
```

### 5. Enable GitHub Pages

-> Go to your repo → Settings

-> Scroll down to Pages

-> Under Source, select:

-> Branch: main

    Folder: / (root)

-> Save

### 6. Get Your Live Website

GitHub will give you a link:

```
https://<your-username>.github.io/fancy-website/
```

--> Open it in the browser → Your fancy website is live 🎉
