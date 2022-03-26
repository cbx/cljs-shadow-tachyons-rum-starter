# cbx starter pack (heavy lifting by https://github.com/lambrospetrou/create-shadow-cljs-app)

- Rum 
- ShadowCLJS
- Tachyons

### Develop

Install all dependencies.

```bash
npm run install
```

Watch compile with with hot reloading, using the `browser` target as example.

```
npm run watch:browser
```

The above command will also start a server at port `5000` so that you can open `http://localhost:5000` and load the website.

### Production release

Build production builds for each target.

```bash
# Build all targets
npm run release
# or
npm run release:app
npm run release:library
npm run release:browser
```

#### Browser

```bash
# Build the JS bundle
npm run release:browser

# Serve the demo at http://localhost:5000
npm run start:browser
```

This will generate a file inside `build/browser/main.js`, and use it from the generated `build/browser/index.html` which loads the script.

The `main.js` file contains your JavaScript logic, so copy that into your server and load it into your main website HTML. See the provided `src/_build_hooks/index.html` as an example.

- [Browser target](https://shadow-cljs.github.io/docs/UsersGuide.html#target-browser)

### REPL

Start a REPL connected to current running program, `app` for the `:build-id`:

```bash
npx shadow-cljs cljs-repl app
```

### License

MIT
