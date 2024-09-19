package org.shounak.hellospring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public ResponseEntity<String> helloController() {
        return ResponseEntity.ok("""
                <!DOCTYPE HTML>
                <html>
                <head>
                    <title>Getting Started: Serving Web Content</title>
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
                    <link href="https://cdn.jsdelivr.net/npm/daisyui@4.12.10/dist/full.min.css" rel="stylesheet" type="text/css"/>
                    <script src="https://cdn.jsdelivr.net/npm/party-js@latest/bundle/party.min.js"></script>
                    <script src="https://cdn.tailwindcss.com"></script>
                </head>
                <body onmousedown="party.confetti(this)">
                <!--<form action="" method="post">-->
                <!--    <label for="username" id="usernameLabel">Username:</label>-->
                <!--    <input type="text" name="username" id="username"/>-->
                <!--    <br/><br/>-->
                <!--    <label for="password" id="passwordLabel">Password:</label>-->
                <!--    <input type="password" name="password" id="password"/>-->
                <!--    <br/><br/>-->
                <!--    <button type="submit">Login</button>-->
                <!--    <button type="reset">Reset</button>-->
                <!--</form>-->
                <!--<p style="color: red" th:text="${errorMessage}"></p>-->
                <!--SECRET HACKER MODE CODE-->
                <!--<div class="hero bg-base-200 min-h-screen" style="background: url('/uploads/758a.gif');background-size: cover;">-->
                <div class="hero bg-base-200 min-h-screen">
                    <div class="hero-content text-center">
                        <div class="max-w-md">
                            <h1 class="text-5xl font-bold">Vulnerable Server</h1>
                            <p class="py-6">
                                Hi Shounak, I hope this project gets a High Distinction 🙃
                            </p>
                            <div class="card bg-base-100 w-full max-w-sm shrink-0 shadow-2xl min-w-full">
                                <form class="card-body" action="" method="post">
                                    <div class="form-control">
                                        <div class="label"><span class="label-text-alt">Username</span></div>
                                        <label class="label input input-bordered flex items-center gap-2" for="username">
                                            <svg
                                                    xmlns="http://www.w3.org/2000/svg"
                                                    viewBox="0 0 16 16"
                                                    fill="currentColor"
                                                    class="h-4 w-4 opacity-70">
                                                <path
                                                        d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6ZM12.735 14c.618 0 1.093-.561.872-1.139a6.002 6.002 0 0 0-11.215 0c-.22.578.254 1.139.872 1.139h9.47Z"/>
                                            </svg>
                                            <input type="text" name="username" id="username" placeholder="" class="grow w-full h-full"
                                                   required/>
                                        </label>
                                    </div>
                                    <div class="form-control">
                                        <div class="label"><span class="label-text-alt">Password</span></div>
                                        <label class="label input input-bordered flex items-center gap-2" for="password">
                                            <svg
                                                    xmlns="http://www.w3.org/2000/svg"
                                                    viewBox="0 0 16 16"
                                                    fill="currentColor"
                                                    class="h-4 w-4 opacity-70">
                                                <path
                                                        fill-rule="evenodd"
                                                        d="M14 6a4 4 0 0 1-4.899 3.899l-1.955 1.955a.5.5 0 0 1-.353.146H5v1.5a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1-.5-.5v-2.293a.5.5 0 0 1 .146-.353l3.955-3.955A4 4 0 1 1 14 6Zm-4-2a.75.75 0 0 0 0 1.5.5.5 0 0 1 .5.5.75.75 0 0 0 1.5 0 2 2 0 0 0-2-2Z"
                                                        clip-rule="evenodd"/>
                                            </svg>
                                            <input type="password" name="password" id="password" placeholder=""
                                                   class="grow h-full w-full" required/>
                                        </label>
                                        <label class="label">
                                            <a href="#" class="label-text-alt text-xl link link-hover text-error"
                                               th:text="${errorMessage}"></a>
                                        </label>
                                    </div>
                                    <div class="form-control mt-6 join flex-row justify-end">
                                        <input type="submit" class="join-item btn btn-primary w-fit"/>
                                        <input type="reset" class="join-item btn btn-primary w-fit"/>
                                    </div>
                                    <input type="hidden"
                                           th:name="${_csrf.parameterName}"
                                           th:value="${_csrf.token}"/>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                </body>
                </html>
                """);
    }
}
