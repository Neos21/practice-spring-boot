# Practice Spring Boot

Spring Boot の学習。

- 環境 : MacOS Mojave + JDK 1.8 + VSCode

```sh
$ sw_vers
ProductName:    Mac OS X
ProductVersion: 10.14.5
BuildVersion:   18F132

$ java -version
Picked up _JAVA_OPTIONS: -Dfile.encoding=UTF-8
java version "1.8.0_202"
Java(TM) SE Runtime Environment (build 1.8.0_202-b08)
Java HotSpot(TM) 64-Bit Server VM (build 25.202-b08, mixed mode)

$ code -version
1.37.0
036a6b1d3ac84e5ca96a17a44e63a87971f8fcc8
x64
```

- VSCode 拡張機能「Spring Boot Extension Pack」の機能を使い、ボイラープレートを作成。
    - 参考 : [Qiita - VSCode で Spring Boot のプロジェクト作成からアプリケーションの実行まで](https://qiita.com/syamshig/items/ff829561238440437b99)
- VSCode の「デバッグ」ペイン → 「Debug (Launch)-DemoApplication」を選択すると `http://localhost:8080/` が起動する。
    - `Build failed, do you want to continue?` のエラーが出る場合は `workspaceStorage` を削除する。
        - 参考 : [だだだだだだいありー - VSCode で Spring Boot を起動しようとしたら「Build failed, do you want to continue?」と表示されて起動しない](http://k6i.hateblo.jp/entry/2018/08/02/225848)
- `SampleController.java` および `sample.html` を実装したので `http://localhost:8080/sample` にアクセスするとページが開く。


## Author

[Neo](http://neo.s21.xrea.com/) ([@Neos21](https://twitter.com/Neos21))


## Links

- [Neo's World](http://neo.s21.xrea.com/)
- [Corredor](http://neos21.hatenablog.com/)
- [Murga](http://neos21.hatenablog.jp/)
- [El Mylar](http://neos21.hateblo.jp/)
- [Neo's GitHub Pages](https://neos21.github.io/)
- [GitHub - Neos21](https://github.com/Neos21/)
